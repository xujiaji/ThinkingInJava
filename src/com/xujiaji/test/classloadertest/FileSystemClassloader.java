package com.xujiaji.test.classloadertest;

import java.io.*;

public class FileSystemClassLoader extends ClassLoader {

    private String rootDir;

    public FileSystemClassLoader(String rootDir) {
        this.rootDir = rootDir;
    }

    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] classData = getClassData(name);
        if (classData == null) {
            throw new ClassNotFoundException();
        }
        else {
            return defineClass(name, classData, 0, classData.length);
        }
    }

    private byte[] getClassData(String className) {
        String path = classNameToPath(className);
        InputStream ins = null;
        ByteArrayOutputStream baos = null;
        try {
            ins = new FileInputStream(path);
            baos = new ByteArrayOutputStream();
            int bufferSize = 4096;
            byte[] buffer = new byte[bufferSize];
            int bytesNumRead = 0;
            while ((bytesNumRead = ins.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesNumRead);
            }
            return baos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        } finally
        {
            closeIO(ins);
            closeIO(baos);
        }
        return null;
    }

    private void closeIO(Closeable closeable)
    {
        if (closeable == null) return;
        try
        {
            closeable.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private String classNameToPath(String className) {
        return rootDir + File.separatorChar
                + className.replace('.', File.separatorChar) + ".class";
    }
}
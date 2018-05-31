package com.xujiaji.thingking._20.sql;

import com.sun.mirror.apt.AnnotationProcessor;
import com.sun.mirror.apt.AnnotationProcessorEnvironment;
import com.sun.mirror.apt.AnnotationProcessorFactory;
import com.sun.mirror.declaration.AnnotationTypeDeclaration;
import com.sun.mirror.declaration.TypeDeclaration;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

public class TableCreationProcessorFactory implements AnnotationProcessorFactory
{

    @Override
    public Collection<String> supportedOptions()
    {
        return Collections.emptySet();
    }

    @Override
    public Collection<String> supportedAnnotationTypes()
    {
        return Arrays.asList(
                "com.xujiaji.thingking._20.sql.DBTable",
                "com.xujiaji.thingking._20.sql.Constraints",
                "com.xujiaji.thingking._20.sql.SQLString",
                "com.xujiaji.thingking._20.sql.SQLInteger");
    }

    @Override
    public AnnotationProcessor getProcessorFor(Set<AnnotationTypeDeclaration> set, AnnotationProcessorEnvironment annotationProcessorEnvironment)
    {
        return new TableCreationProcessor(annotationProcessorEnvironment);
    }


    private static class TableCreationProcessor implements AnnotationProcessor
    {
        private final AnnotationProcessorEnvironment env;
        private String sql = "";

        public TableCreationProcessor(AnnotationProcessorEnvironment env)
        {
            this.env = env;
        }

        @Override
        public void process()
        {
            for (TypeDeclaration typeDecl : env.getSpecifiedTypeDeclarations())
            {
//                typeDecl.accept();
            }
        }
    }
}

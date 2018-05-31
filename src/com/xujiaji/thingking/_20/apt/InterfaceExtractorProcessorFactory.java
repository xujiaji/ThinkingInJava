package com.xujiaji.thingking._20.apt;

import com.sun.mirror.apt.AnnotationProcessor;
import com.sun.mirror.apt.AnnotationProcessorEnvironment;
import com.sun.mirror.apt.AnnotationProcessorFactory;
import com.sun.mirror.declaration.AnnotationTypeDeclaration;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

public class InterfaceExtractorProcessorFactory implements AnnotationProcessorFactory
{
    @Override
    public Collection<String> supportedOptions()
    {

        return Collections.emptySet();
    }

    @Override
    public Collection<String> supportedAnnotationTypes()
    {
        return Collections.singleton("com.xujiaji.thingking._20.apt.ExtractInterface");
    }

    @Override
    public AnnotationProcessor getProcessorFor(Set<AnnotationTypeDeclaration> set, AnnotationProcessorEnvironment annotationProcessorEnvironment)
    {
        return new InterfaceExtractorProcessor(annotationProcessorEnvironment);
    }
}

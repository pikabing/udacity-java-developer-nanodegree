package com.demo.graphql.exceptions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

public class BreedNotFoundException extends RuntimeException implements GraphQLError {

    private Map<String, Object> extensions = new HashMap<String, Object>();

    public BreedNotFoundException(String message, String invalidBreed) {
        super(message);
        extensions.put("invalidBreed", invalidBreed);
    }

    @Override
    public Map<String, Object> getExtensions() {
        return extensions;
    }
    
    @Override
    public ErrorType getErrorType() {
        return null;
    }

    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

}
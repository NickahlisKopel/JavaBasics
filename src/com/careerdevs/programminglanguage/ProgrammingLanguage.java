package com.careerdevs.programminglanguage;

public class ProgrammingLanguage {
    public String name;
    public boolean isObjectOriented;
    public String fileExtension;

    public ProgrammingLanguage(String name, boolean isObjectOriented, String fileExtension) {
        this.name = name;
        this.isObjectOriented = isObjectOriented;
        this.fileExtension = fileExtension;
    }

    @Override
    public String toString() {
        return "name: " + name +
                " is Object Oriented: " + isObjectOriented +
                " File Extension: " + fileExtension;
    }
}

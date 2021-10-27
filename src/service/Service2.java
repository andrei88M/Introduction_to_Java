package service;

import service.five.*;
import service.foir.ProgrammingWithClasses;
import service.one.BasicOfSoftwareCodeDevelopment;
import service.three.StringAndBasicOfTextProcessing;
import service.two.Algorithmization;

public class Service2 {
    public BasicOfSoftwareCodeDevelopment basicOfSoftwareCodeDevelopment() {
        return new BasicOfSoftwareCodeDevelopment();
    }

    public Algorithmization algorithmization() {
        return new Algorithmization();
    }

    public StringAndBasicOfTextProcessing stringAndBasicOfTextProcessing() {
        return new StringAndBasicOfTextProcessing();
    }

    public ProgrammingWithClasses programmingWithClasses() {
        return new ProgrammingWithClasses();
    }

    public BasicOfOOPFactory basicOfOOP() {
        return new BasicOfOOP();
    }

}

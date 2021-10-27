package service.three;

public class StringAndBasicOfTextProcessing {
    public StringAndBasicOfTextProcessingFactory stringAsAnArray() {
        return new StringArrayOfCharacters();
    }

    public StringAndBasicOfTextProcessingFactory stringAsWithTypeObject() {
        return new StringAsWithTypeObject();
    }

    public RegularExpressions regularExpressions(){
        return new RegularExpressions();
    }
}

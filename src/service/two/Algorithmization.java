package service.two;

public class Algorithmization {

    public AlgorithmizationFactory multiArray() {
        return new MultiArray();
    }

    public AlgorithmizationFactory oneArray() {
        return new OneArray();
    }

    public AlgorithmizationFactory sorting() {
        return new Sorting();
    }

    public AlgorithmizationFactory decomposition(){
        return new Decomposition();
    }

}

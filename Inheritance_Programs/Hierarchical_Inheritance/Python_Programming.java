package Java_Programs.Inheritance_Programs.Hierarchical_Inheritance;

class Python_Programming extends Programming{
    String newFeatures;
    Python_Programming(String newFeatures){
        this.newFeatures=newFeatures;
    }

    void printInfo() {
        System.out.println("New Features : "+this.newFeatures);
    }
}

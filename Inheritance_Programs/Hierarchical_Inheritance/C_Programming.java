package Java_Programs.Inheritance_Programs.Hierarchical_Inheritance;

class C_Programming extends Programming{
    String newFeatures;
    C_Programming(String newFeatures){
        this.newFeatures=newFeatures;
    }

    void printInfo() {
        System.out.println("New Features : "+this.newFeatures);
    }

}

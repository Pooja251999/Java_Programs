package Java_Programs.OOPs_Concept_Programs.Inheritance_Programs.Hierarchical_Inheritance;

class Programming {
   String author;
   Float version;

   Programming(){
       author="ABC";
       version=1.0f;
   }

    public Programming(String author, Float version) {
        this.author = author;
        this.version=version;
    }

    void printInfo(){
        System.out.println("Author : " +this.author+"   ||  "+"Version : "+this.version);
    }
}

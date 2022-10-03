public class Author {
    private final String surname;
    private final String name;

    public Author(String name,String surname){
        this.name = name;
        this.surname = surname;
    }
    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }

}

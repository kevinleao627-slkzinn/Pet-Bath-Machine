public class Pet {

    private String name; //Nome do pet
    private boolean clean; //Indica se o pet está limpo ou não

    public Pet(String name) { // Construtor que inicializa o nome e define o pet como sujo
        this.name = name;
        this.clean = false;
    }

    public String getName() { //Retorna o nome do pet
        return name;
    }

    public boolean isClean() { //Retorna se o pet está limpo
        return clean;
    }

    public void setClean(boolean clean) { //Define o estado de limpeza do pet
        this.clean = clean;
    }
}


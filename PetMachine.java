public class PetMachine {

    private boolean clean = true; //Indica se a máquina está limpa ou não
    private int water = 30; //Litros de água na máquina
    private int shampoo = 10; //Litros de shampoo na máquina
    private Pet pet; //Pet atualmente na máquina

    public void takeShower() { //Realiza o banho do pet
        if (pet == null) {
            System.out.println("Coloque o pet na máquina para iniciar o banho.");
            return;
        }

        if (water < 10 || shampoo < 2) {
            System.out.println("Água ou shampoo insuficientes.");
            return;
        }
        //Consome recursos e limpa o pet
        water -= 10;
        shampoo -= 2;
        pet.setClean(true);
        clean = false;

        System.out.println("O pet " + pet.getName() + " está limpo!");
    }

    public void addWater() { //Adiciona água à máquina
        if (water >= 30) {
            System.out.println("A máquina já está cheia de água.");
            return;
        }
        water += 2;
    }

    public void addShampoo() { //Adiciona shampoo à máquina
        if (shampoo >= 10) {
            System.out.println("A máquina já está cheia de shampoo.");
            return;
        }
        shampoo += 2;
    }

    public int getWater() { //Retorna a quantidade de água na máquina
        return water;
    }

    public int getShampoo() { //Retorna a quantidade de shampoo na máquina
        return shampoo;
    }

    public boolean hasPet() { //Verifica se há um pet na máquina
        return pet != null;
    }

    public void setPet(Pet pet) { //Coloca um pet na máquina
        if (this.pet != null) {
            System.out.println("Já existe um pet na máquina.");
            return;
        }
        this.pet = pet;
        System.out.println("Pet " + pet.getName() + " colocado na máquina.");
    }

    public void removePet() { //Remove o pet da máquina
        if (pet == null) {
            System.out.println("Não há pet na máquina.");
            return;
        }

        clean = pet.isClean();
        System.out.println("O pet " + pet.getName() + " foi removido.");
        pet = null;
    }

    public void wash() { //Limpa a máquina
        if (water < 10 || shampoo < 2) {
            System.out.println("Água ou shampoo insuficientes para lavar a máquina.");
            return;
        }

        water -= 10;
        shampoo -= 2;
        clean = true;

        System.out.println("A máquina está limpa.");
    }
}

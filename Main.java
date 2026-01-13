import java.util.Scanner;

public class Main {

  private final static Scanner scanner = new Scanner(System.in); // Scanner para ler a entrada do usuário

  private final static PetMachine petMachine = new PetMachine(); // Instância da máquina de banho para pets
    public static void main(String[] args) {
     
      var option = -1; // variável para armazenar a opção escolhida pelo usuário

      do{ //Loop do menu principal
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Banho no pet");
        System.out.println("2 - Abastecer a máquina com agua");
        System.out.println("3 - Abastecer a máquina com shampoo");
        System.out.println("4 - Verificar nível da agua");
        System.out.println("5 - Verificar nível do shampoo");
        System.out.println("6 - Verificar se há um pet na máquina");
        System.out.println("7 - Colocar pet na máquina");
        System.out.println("8 - Retirar pet da máquina");
        System.out.println("9 - Limpar a máquina");
        System.out.println("0 - Sair");

        option = scanner.nextInt(); // Lê a opção escolhida pelo usuário

        switch (option) {  // Executa a ação correspondente à opção escolhida
          case 1 -> petMachine.takeShower();
          case 2 -> setWater();
          case 3 -> setShampoo();
          case 4 -> VerifyWaterLevel();
          case 5 -> VerifyShampooLevel();
          case 6 -> checkIfHasPetInMachine();
          case 7 -> setPetInPetMachine();
          case 8 -> petMachine.removePet();
          case 9 -> petMachine.wash();
          case 0 -> System.exit(0);
          default -> System.out.println("Opção inválida.");
        }

      }while(option != 0); //O loop continua até o usuário escolher sair (opção 0)
    }

    //Metodos auxiliares para cada opção do menu

    private static void setWater(){
      System.out.println("Tentando encher a máquina com água...");
      petMachine.addWater();
    }
    private static void setShampoo(){
      System.out.println("Tentando encher a máquina com shampoo...");
      petMachine.addShampoo();
    }
    private static void VerifyWaterLevel(){
      var amount = petMachine.getWater();
      System.out.println("A máquina está no momento com " + amount + " litros de água.");
    }
    private static void VerifyShampooLevel(){
      var amount = petMachine.getShampoo();
      System.out.println("A máquina está no momento com " + amount + " litros de shampoo.");
    }
    private static void checkIfHasPetInMachine(){
      var hasPet = petMachine.hasPet();
      System.out.println(hasPet ? "Há um pet na máquina." : "Não há um pet na máquina.");

    }
    //Solicita o nome do pet e o adiciona na máquina
    private static void setPetInPetMachine(){
      var name = "";
      while(name == null || name.isEmpty()){
        System.out.println("Digite o nome do pet:");
        name = scanner.next();
      }
      var pet = new Pet(name);
      petMachine.setPet(pet);
      System.out.println("O pet " + pet.getName() + " foi colocado na máquina.");
    }
}

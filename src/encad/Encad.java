package encad;

import java.util.Scanner;

public class Encad {

    static Scanner in = new Scanner(System.in);

    static SimplePos simpleFirst = null;
    static SimplePos simpleLast = null;

    public static void main(String[] args) {
        System.out.println("Start");
        simpleControle(3);
    }

    /**
     * Método utilizado para controlar a lista encadeada simples.
     *
     * @param opc 1 para adicionar no inicio,
     * <br>2 para adicionar no final,
     * <br>3 para verificar se objeto específico está na lista,
     * <br>4 para remover objeto específico da lista <b>(FIFO)</b>,
     * <br>5 para remover o primeiro objeto da lista,
     * <br>6 para remover o último objeto da lista,
     * <br>7 para mostrar todos os objetos da lista em sentido primeiro para o
     * último,
     * <br>8 para mostrar todos os objetos da lista em sentido último para o
     * primeiro.
     */
    private static void simpleControle(int opc) {
        try {
            SimplePos current = null;
            SimplePos curPos = simpleFirst;
            switch (opc) {
                /**
                 * Adicionar no início
                 */
                case 1:
                    System.out.print("Escreva o valor a ser adicionado no início da lista: ");
                    current = new SimplePos(in.next());
                    if (simpleFirst != null) {
                        current.setNext(simpleFirst);
                    }
                    simpleFirst = current;
                    break;
                /**
                 * Adicionar no final
                 */
                case 2:
                    System.out.print("Escreva o valor a ser adicionado no final da lista:");
                    current = new SimplePos(in.next());
                    simpleLast.setNext(current);
                    simpleLast = current;
                    break;
                /**
                 * Verificar a existência de objeto X
                 */
                case 3:
                    System.out.print("Escreva o valor a ser encontrado na lista: ");
                    current = new SimplePos(in.next());
                    try {
                        while (true) {
                            if (curPos.getValue().equals(current.getValue())) {
                                throw new Exception("Valor encontrado!");
                            }
                            curPos = curPos.getNext();
                        }
                    } catch (Exception e) {
                        if (e.getMessage() == null) {
                            System.out.println("O objeto não existe!");
                        } else if (e.getMessage().equals("Valor encontrado!")) {
                            System.out.println("O objeto existe!");
                            break;
                        }

                        //e.printStackTrace();
                    }
                    break;
                /**
                 * Remover objeto específico
                 */
                case 4:
                    System.out.print("Escreva o objeto a ser excluído.");
                    current = new SimplePos(in.next());
                    try {
                        while (true){
                            if (curPos.getValue().equals(current.getValue())){
                                throw new Exception("Valor encontrado");
                            }
                            curPos = curPos.getNext();
                        }
                    } catch (Exception e){
                        
                    }
                    break;
                default:

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

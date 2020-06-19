/*
Entrega do Trabalho 2- Algoritmos e Programação II
Nós,
Gustavo Costa Santos Almeida
Luís Felipe da Costa Angelo
declaramos que
todas as respostas são fruto de nosso próprio trabalho,
não copiamos respostas de colegas externos à equipe,
não disponibilizamos nossas respostas para colegas externos ao grupo e
não realizamos quaisquer outras atividades desonestas para nos beneficiar ou
prejudicar outros.

 /* Dados importantes

Data de entrega: 01/06/2020
Curso: Bacharelado em Jogos Digitais
Semestre: 3°
Matéria: Algoritmo e programação II
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ordenacao {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileReader le = new FileReader("ordenacao.txt");
        // bufferiza a entrada do arquivo para ser possivel ler uma linha inteira no arquivo
        BufferedReader leBufferizado = new BufferedReader(le);

        // lê uma linha do arquivo de entrada
        String texto = leBufferizado.readLine();
        
        //Converte a String passada na primeira linha do arquivo em um inteiro
        int numLinhas = Integer.parseInt(texto);

        System.out.println("Numero de linhas: " + numLinhas);
        
        /*
        O trecho abaixo é responsável por realizar a leitura de todas as linhas do arquivo
        e por diminuir todas as letras do arquivo que estiverem maiusculas
        */
        
        for (int j = 0; j < numLinhas; j++) {
            System.out.print((j + 1) + " Linha: ");
            texto = leBufferizado.readLine();
            String palavras[] = texto.toLowerCase().split(" ");
            palavras = sort(palavras);
            for(int i = 0; i < palavras.length; i++) {
            	System.out.print(palavras[i] + " ");
            }  
            System.out.println();
        }
    }

    /*
    A função abaixo é responsável por realizar as verificações
    de cada palavra em relação ao seu tamanho, ordem lexográfica,
    e ordem alfabética, caso o tamanho de duas palavras sejam iguais
    
    */
    
    
    public static String[] sort(String[] palavras) {
        String temp;
        for (int j = 0; j < palavras.length; j++) {
            for (int i = j + 1; i < palavras.length; i++) {;
                if (palavras[i].length() > palavras[j].length()) {
                    temp = palavras[j];
                    palavras[j] = palavras[i];
                    palavras[i] = temp;
                } else if (palavras[i].length() == palavras[j].length() && palavras[i].compareTo(palavras[j]) < 0) {
                    temp = palavras[j];
                    palavras[j] = palavras[i];
                    palavras[i] = temp;
                }
            }
        }
        return palavras;
    }
}



import java.util.Scanner;

public class Main{

    public static int doomAno(){//calc doom do ano
        return -1;
    }

    public static int separaDigitosDoAno(int ano){ //retornar apenas os dois primeiros dígitos de um número
        int resto = 0;
        int acc = 0;
        int cont = 0;
        while(ano>0 && cont<=1){
            resto = ano % 10;
            ano /= 10;
            acc += resto * Math.pow(10, cont);
            cont++;
        }

        return acc;
    }

    public static int descobrirAncoraDoSeculo(int ano){ //terça, domingo, sexta, quarta, terça...1,2,3,4,5... entregar 2 primeiros dígitos do ano!
        
        int i = 16;
        int cont = 1; 
        int ancora = -1;

        if(ano == i){ //conta quantos séculos de distância tem do século base
            cont = 1;
        }else if(ano>i){
            do{
                i++;
                cont++;
                if(cont>4){ //reinicia a contagem do ciclo
                    cont = 1;
                }
            }while(ano>i);
        }else{
            do{
                i--;
                cont--;
                if(cont>4){ //reinicia a contagem do ciclo
                    cont = 1;
                 }
            }while(ano<i);
        }

        if(cont==1){ //seleciona o dia da semana, com base em quantos séculos andou
            //terça
            ancora = 2;
        }else if(cont==2){
            //domingo
            ancora = 0;
        }else if(cont==3){
            //sexta
            ancora = 5;
        }else if(cont==4){
            //quarta
            ancora = 3;
        }else{
            //inválido
            System.out.println("Erro: A âncora não recebeu um valor válido!");
        }

        return ancora;
    }

    public static void main(String[] args){
        int ano = 0; //criar um conversor que tira os 2 dig
        int mes = 0; //impedir que o usuário extrapole 12 ou 1
        int dia = 0; //impedir que estrapole 31 && formatar a data

        Scanner scanner = new Scanner(System.in);

        ano = scanner.nextInt();

        System.out.println(separaDigitosDoAno(ano));
        //System.out.println(descobrirAncoraDoSeculo(ano));
        

        scanner.close();
    }
}

/*
#COMO CALCULAR O DIA DA SEMANA QUE UMA DATA VAI CAIR 
(ALGORÍTIMO DO JUÍZO FINAL)

PARTE I:
    . jogar os valores na fórmula, para encontrar o doomsday do ano;
    . S = 
    . sabemos que no ano 2000, o doomsday era terça feira;
    . se for em outro século, vai ter que ajustar o doomsday do século
    seguindo a regrinha;
PARTE II:
    . com o doomsday do ano calculado, sabemos o dia do doomsday daquele ano;
    . em seguida, analisamos o mês da data fornecida e cruzamos esse dado
    com o doomsday daquele mês;
    . somamos ou subtraimos de acordo com a situação;

OBS:
    . MEMORIZE QUE:
        - 0 = domingo;
        - 1 = segunda;
        - 2 = terça;
        - 3 = quarta;
        - 4 = quinta;
        - 5 = sexta;
        - 6 = sábado;
    . lembre-se que ao somar 7 em um dia qualquer da semana,
    vc volta para ele;
    . para o ano 2000 - 2099, a âncora = terça;

*/
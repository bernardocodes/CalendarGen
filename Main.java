public class Main{

    public static int doomAno(){//calc doom do ano
        return -1;
    }

    public static void main(String[] args){
        int ano = 26; //criar um conversor que tira os 2 dig
        int mes = 10; //impedir que o usuário extrapole 12 ou 1
        int dia = 18; //impedir que estrapole 31 && formatar a data


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
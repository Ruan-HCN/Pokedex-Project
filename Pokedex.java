package Pokedex;

import java.util.Scanner;

public class Pokedex {

    public static void consultar(String[] lista, String[] lista2) {
        int numconsul;
        Scanner consulta = new Scanner(System.in);

        do {
            System.out.print("\n\n");
            System.out.println("Consulte o pokémon e sua descrição pelo número(1 até " + lista.length + ")!");
            System.out.print("\nDigite o número do pokémon, ou digite 0 para voltar: ");
            numconsul = consulta.nextInt();

            if (numconsul >= 1 && numconsul < lista.length + 1) {
                System.out.println("\nPokémon encontrado:");
                System.out.println("\n" + lista[numconsul - 1]);
                System.out.println(lista2[numconsul - 1]);
            } else {
                System.out.println("Posição inválida!");
            }
        }while (numconsul != 0);
    }

    public static void fraco() {
        int tipo;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("\n\n========================= Tipos =========================");
            System.out.print("\n\n1. Água          9. Inseto\n" +
                    "2. Fogo         10. Normal\n" +
                    "3. Planta       11. Pedra\n" +
                    "4. Aço          12. Psíquico\n" +
                    "5. Dragão       13. Sombrio\n" +
                    "6. Fada         14. Terrestre\n" +
                    "7. Fantasma     15. Veneno\n" +
                    "8. Gelo         16. Voador\n\n" +
                    "0. Voltar\n\n");
            System.out.print("Escolha uma das opções: ");
            tipo = input.nextInt();
            System.out.print("\n\n=========================================================");

            switch (tipo) {
                case 1:
                    System.out.println("\nÁgua");
                    System.out.println("Fraqueza: Elétrico, Planta.");
                    System.out.println("Resistência: Aço, Água, Fogo, Gelo.");
                    break;

                case 2:
                    System.out.println("\nFogo");
                    System.out.println("Fraqueza: Água, Pedra, Terrestre");
                    System.out.println("Resistência: Aço, Fada, Fogo, Gelo, Inseto, Planta.");
                    break;

                case 3:
                    System.out.println("\nPlanta");
                    System.out.println("Fraqueza: Fogo, Inseto, Voador.");
                    System.out.println("Resistência: Água, Elétrico, Planta, Terrestre.");
                    break;

                case 4:
                    System.out.println("\nAço");
                    System.out.println("Fraqueza: Fogo, Lutador, Terrestre.");
                    System.out.println("Resistência: Aço, Dragão, Fada, Gelo, Inseto, Normal, Pedra, Planta, Psíquico, Voador.");
                    break;

                case 5:
                    System.out.println("\nDragão");
                    System.out.println("Fraqueza: Dragão, Fada, Gelo.");
                    System.out.println("Resistência: Elétrico, Fogo, Planta, Água.");
                    break;

                case 6:
                    System.out.println("\nFada");
                    System.out.println("Fraqueza: Aço, Veneno.");
                    System.out.println("Resistência: Lutador, Inseto, Sombrio.");
                    break;

                case 7:
                    System.out.println("\nFantasma");
                    System.out.println("Fraqueza: Fantasma, Sombrio.");
                    System.out.println("Resistência: Inseto, Psíquico.");
                    System.out.println("Imune: Lutador, Normal");
                    break;

                case 8:
                    System.out.println("\nGelo");
                    System.out.println("Fraqueza: Aço, Fogo, Lutador, Pedra.");
                    System.out.println("Resistência: Gelo");
                    break;

                case 9:
                    System.out.println("\nInseto");
                    System.out.println("Fraqueza: Fogo, Pedra, Voador.");
                    System.out.println("Resistência: Lutador, Planta, Terrestre.");
                    break;

                case 10:
                    System.out.println("\nNormal");
                    System.out.println("Fraqueza: Lutador.");
                    System.out.println("Imune: Fantasma");
                    break;

                case 11:
                    System.out.println("\nPedra");
                    System.out.println("Fraqueza: Aço, Água, Lutador, Planta, Terrestre.");
                    System.out.println("Resistência: Fogo, Veneno, Voador.");
                    break;

                case 12:
                    System.out.println("\nPsíquico");
                    System.out.println("Fraqueza: Fantasma, Inseto, Sombrio.");
                    System.out.println("Resisitência: Lutador, Veneno.");
                    break;

                case 13:
                    System.out.println("\nSombrio");
                    System.out.println("Fraqueza: Inseto, Fada, Lutador.");
                    System.out.println("Resisitência: Sombrio, Fantasma.");
                    System.out.println("Imune: Psíquico.");
                    break;

                case 14:
                    System.out.println("\nTerrestre");
                    System.out.println("Fraqueza: Água, Gelo, Planta.");
                    System.out.println("Resistência: Pedra, Veneno.");
                    System.out.println("Imune: Elétrico.");
                    break;

                case 15:
                    System.out.println("\nVeneno");
                    System.out.println("Fraqueza: Psíquico, Terrestre.");
                    System.out.println("Resistência: Fada, Inseto, Lutador, planta, veneno.");
                    break;

                case 16:
                    System.out.println("\nVoador");
                    System.out.println("Fraqueza: Elétrico, Gelo, Pedra.");
                    System.out.println("Resistência: Inseto, Lutador, Planta.");
                    System.out.println("Imune: Terrestre");
                    break;

                case 0:
                    System.out.println("\nVoltando!\n");
                    break;

                default:
                    System.out.println("\nDigite uma opção válida!\n");
                    break;

            }
        } while (tipo != 0);
    }

    public static void exibir(String[] lista) {
        int i;

        System.out.print("\n");

        for (i = 0; i < lista.length; i++) {
            System.out.printf("\n%d. %s", i + 1, lista[i]);
        }
        System.out.print("\n\n");
    }

    public static int resposta_certa() {
        int resposta;
        Scanner quize = new Scanner(System.in);

        do {
            System.out.print("\nDigite uma das Alternativas(1, 2, 3 ou 4): ");
            resposta = quize.nextInt();
            if (resposta < 1 || resposta > 4) {
                System.out.println("Resposta Inválida!");
            }
        } while (resposta < 1 || resposta > 4);

        return resposta;
    }

    public static void quiz() {
        int resposta, acerto = 0;

        System.out.println("Bem-Vindo ao Poké-Quiz!\n\n");

        System.out.println("1º) Qual o nome da evolução tipo Elétrico da Eevee?");
        System.out.println("\n1. Vaporeon\n2. Umbreon\n3. Jolteon\n4. Flareon");
        resposta = resposta_certa();
        if (resposta == 3) {
            System.out.println("\nCerto!\n");
            acerto++;
        } else {
            System.out.println("\nErrou!\n");
        }

        System.out.println("2º) O tipo Fantasma tem imunidade a que tipos?");
        System.out.println("\n1. Lutador/Inseto\n2. Lutador/Normal\n3. Psíquico/Normal\n4. Psíquico/Veneno");
        resposta = resposta_certa();
        if (resposta == 2) {
            System.out.println("\nCerto!\n");
            acerto++;
        } else {
            System.out.println("\nErrou!\n");
        }

        System.out.println("3º) Qual o nome da forma intermediária do Poliwag?");
        System.out.println("\n1. Poliwrath\n2. Politoed\n3. Magikarp\n4. Poliwhril");
        resposta = resposta_certa();
        if (resposta == 4) {
            System.out.println("\nCerto!\n");
            acerto++;
        } else {
            System.out.println("\nErrou!\n");
        }

        System.out.println("4º) Este pokémon pode evoluir através de pedra, o pokémon número 133 na pokédex é?");
        System.out.println("\n1. Eevee\n2. Clefairy\n3. Jigglypuff\n4. Pikachu");
        resposta = resposta_certa();
        if (resposta == 1) {
            System.out.println("\nCerto!\n");
            acerto++;
        } else {
            System.out.println("\nErrou!\n");
        }

        System.out.println("5º) Qual a cor do Pikachu Shiny?");
        System.out.println("\n1. Laranja\n2. Azul\n3. Verde\n4. Preto");
        resposta = resposta_certa();
        if (resposta == 1) {
            System.out.println("\nCerto!\n");
            acerto++;
        } else {
            System.out.println("\nErrou!\n");
        }

        System.out.println("6º) Qual Pokémon possui os códigos genéticos de todos os Pokémon em seu DNA?");
        System.out.println("\n1. Mewtwo\n2. Makikarp\n3. Mew\n4. Porygon");
        resposta = resposta_certa();
        if (resposta == 3) {
            System.out.println("\nCerto!\n");
            acerto++;
        } else {
            System.out.println("\nErrou!\n");
        }

        System.out.println("7º) \"Ele é muito protetor de seu território, sempre irá atacar brutalmente qualquer intruso. Possui uma ótima visão, mesmo voando bem alto " +
                "\nirá localizar sua presa. Suas garras afiadas e bastante desenvolvidas são a sua arma de ataque. Ele pode carregar presas como um Exeggcute " +
                "\npara seu ninho a mais de 100 km de distância.\" Essa descrição se encaixa em que pokémon?");
        System.out.println("\n1. Fearow\n2. Spearow\n3. Pigeot\n4. Pidgotto");
        resposta = resposta_certa();
        if (resposta == 4) {
            System.out.println("\nCerto!\n");
            acerto++;
        } else {
            System.out.println("\nErrou!\n");
        }

        System.out.println("8º) O Psyduck e o Golduck são de qual tipo(s)?");
        System.out.println("\n1. Água    Água/Gelo\n2. Água    Água\n3. Água    Água/psíquico\n4. NDA");
        resposta = resposta_certa();
        if (resposta == 2) {
            System.out.println("\nCerto!\n");
            acerto++;
        } else {
            System.out.println("\nErrou!\n");
        }

        System.out.println("9º) Qual o nome da ave lendária do tipo Fogo?");
        System.out.println("\n1. Articuno\n2. Zapdos\n3. Moltres\n");
        resposta = resposta_certa();
        if (resposta == 3) {
            System.out.println("\nCerto!\n");
            acerto++;
        } else {
            System.out.println("\nErrou!\n");
        }

        do {
            System.out.println("10º) Escolha o Inicial de Kanto:");
            System.out.println("\n1. Bulbasaur\n2. Charmander\n3. Squirtle\n");
            resposta = resposta_certa();
            if (resposta == 2) {
                System.out.println("\nCerto!\n");
                acerto++;
            } else {
                System.out.println("\nResposta Errada!\n");
            }
        }while (resposta != 2);

        String terno = (acerto >=1 && acerto <= 4) ? + acerto + " Insígnias, Você é apenas um Fracassado!" :
                        (acerto == 5) ? + acerto + " Insígnias, você é Esforçado!" :
                                (acerto >= 6 && acerto <= 8) ? + acerto + " Insignias, Você é um treinador pokémon!" :
                                        (acerto >= 9 && acerto <= 10) ? + acerto + " Insígnias, você é um Mestre Pokémon!" : "Erro!";

        System.out.println("\n" + terno);

    }

    public static void menu(String[] lista, String[] lista2) {
        short opcao;
        Scanner escolha = new Scanner(System.in);

        do {
            System.out.print("\n========================= Menu PokéDex de Kanto =========================");
            System.out.print("\n\n1. Consultar Pokémon por número\n2. Exibir Todos\n3. Fraquezas/Resistências de cada tipo\n4. Poké-Quiz\n5. Sair\n\n");
            System.out.print("Escolha uma das opções: ");
            opcao = escolha.nextShort();
            System.out.print("\n\n=========================================================================");

            switch (opcao) {
                case 1:
                    consultar(lista, lista2);
                    break;

                case 2:
                    exibir(lista);
                    break;

                case 3:
                    fraco();
                    break;

                case 4:
                    quiz();
                    break;

                case 5:
                    System.out.println("\nSaindo...");
                    break;

                default:
                    System.out.println("\nDigite uma opção válida!");
                    break;
            }

        } while (opcao != 5);
        escolha.close();
    }

    public static void main(String[] args) {
        String[] pokemons = {"Bulbasaur", "Ivysaur", "Venusaur", "Charmander", "Charmeleon", "Charizard", "Squirtle", "Wartortle", "Blastoise", "Caterpie", "Metapod", "Butterfree", "Weedle",
                "Kakuna", "Beedrill", "Pidgey", "Pidgeotto", "Pidgeot", "Rattata", "Raticate", "Spearow", "Fearow", "Ekans", "Arbok", "Pikachu", "Raichu", "Sandshrew", "Sandslash", "Nidoran♀",
                "Nidorina", "Nidoqueen", "Nidoran♂", "Nidorino", "Nidoking", "Clefairy", "Clefable", "Vulpix", "Ninetales", "Jigglypuff", "Wigglytuff", "Zubat", "Golbat", "Oddish", "Gloom", "Vileplume",
                "Paras", "Parasect", "Venonat", "Venomoth", "Diglett", "Dugtrio", "Meowth", "Persian", "Psyduck", "Golduck", "Mankey", "Primeape", "Growlithe", "Arcanine", "Poliwag", "Poliwhirl", "Poliwrath",
                "Abra", "Kadabra", "Alakazam", "Machop", "Machoke", "Machamp", "Bellsprout", "Weepinbell", "Victreebel", "Tentacool", "Tentacruel", "Geodude", "Graveler", "Golem", "Ponyta", "Rapidash", "Slowpoke",
                "Slowbro", "Magnemite", "Magneton", "Farfetch'd", "Doduo", "Dodrio", "Seel", "Dewgong", "Grimer", "Muk", "Shellder", "Cloyster", "Gastly", "Haunter", "Gengar", "Onix", "Drowzee", "Hypno", "Krabby",
                "Kingler", "Voltorb", "Electrode", "Exeggcute", "Exeggutor", "Cubone", "Marowak", "Hitmonlee", "Hitmonchan", "Lickitung", "Koffing", "Weezing", "Rhyhorn", "Rhydon", "Chansey", "Tangela", "Kangaskhan",
                "Horsea", "Seadra", "Goldeen", "Seaking", "Staryu", "Starmie", "Mr. Mime", "Scyther", "Jynx", "Electabuzz", "Magmar", "Pinsir", "Tauros", "Magikarp", "Gyarados", "Lapras", "Ditto", "Eevee", "Vaporeon",
                "Jolteon", "Flareon", "Porygon", "Omanyte", "Omastar", "Kabuto", "Kabutops", "Aerodactyl", "Snorlax", "Articuno", "Zapdos", "Moltres", "Dratini", "Dragonair", "Dragonite", "Mewtwo", "Mew"};

        String[] descricao = {"Tipo: Planta/Veneno \n\nDescrição: Desde o dia em que nasceu possui uma semente estranha plantada em suas costas. O bulbo em \n" +
                "suas costas está cheio de nutrientes. Nele, Bulbasaur armazena suas energias. O bulbo vai \n" +
                "crescendo à medida que envelhece porque ele absorve os raios de sol.",

                "Tipo: Planta/Veneno \n\nDescrição: A exposição à luz solar aumenta sua força. A luz do sol fará a flor em suas costas crescer. \n" +
                        "Conforme Ivysaur for crescendo, essa flor irá desabrochar. Ela irá soltar um doce aroma quando\n" +
                        " florescer. Quando o bulbo em sua parte traseira fica grande, parece perder a capacidade de ficar\n" +
                        " em pé sobre as patas traseiras.",

                "Tipo: Planta/Veneno \n\nDescrição: A luz solar que a flor de suas costas absorve produz energia para seu corpo. Por esta razão, ele \n" +
                        "fica mais forte no verão. O aroma dessa flor pode acalmar as emoções das pessoas. Depois de \n" +
                        "um dia chuvoso, a flor nas costas tem um cheiro mais forte. O cheiro atrai outros pokémons.",

                "Tipo: Fogo \n\nDescrição: A chama que possui na ponta de seu rabo mostra a força de sua vida. Se ele estiver fraco, \n" +
                        "a chama irá diminuir. Quando está saudável, a chama brilhará intensamente. Tem preferência por \n" +
                        "coisas quentes. Quando chove, diz-se que o vapor jorra da ponta da cauda. Sua vida acabaria \n" +
                        "se essa chama se apagasse.",

                "Tipo: Fogo \n\nDescrição: Gosta muito de brigas, por isso busca constantemente por adversários. Ele ataca com suas garras \n" +
                        "afiadas e usando sua cauda como chicote de fogo. Pode soltar chamas azuis quando muito \n" +
                        "animado. Quando ele balança sua cauda em chamas, ele eleva a temperatura do ar a níveis \n" +
                        "insuportavelmente altos. Nas montanhas rochosas onde vive Charmeleon, suas caudas \n" +
                        "de fogo brilham à noite como estrelas.",

                "Tipo: Fogo/Voador \n\nDescrição: Seu fogo é quente o suficiente para derreter rochas. Quando nervoso, a chama em sua cauda \n" +
                        "queimará intensamente. É orgulhoso e voa pelos céus em busca de adversários poderosos. Suas \n" +
                        "asas podem transportar este pokémon até uma altitude de 1.400 metros. Expele fogo \n" +
                        "em temperaturas muito altas",

                "Tipo: Água \n\nDescrição: Quando nasce, seu casco é mole, mas logo endurece. Cutucando com o dedo fará os pedaços de " +
                        "\nseu casco saltar. Ele entra dentro do casco quando se sente ameaçado. Esguicha água com " +
                        "\numa força vigorosa para atacar. A forma arredondada do casco e as ranhuras em sua superfície " +
                        "\najudam a minimizar a resistência na água, permitindo-o nadar em alta velocidade.",

                "Tipo: Água \n\nDescrição: É muito inteligente, sabe controlar as orelhas e o rabo para manter o equilíbrio na água e nadar " +
                        "\nem altas velocidades. Seu rabo felpudo é símbolo de longevidade. Se seu casco tiver algas, este " +
                        "\nWartortle é muito velho. Os arranhões em seu casco são evidências da resistência deste pokémon como lutador.",

                "Tipo: Água \n\nDescrição: O casco em suas costas possuem canhões que jorram água pressurizada forte o suficiente para " +
                        "\nperfurar uma parede de concreto. Eles podem disparar balas de água com precisão suficiente " +
                        "\npara atingir latas vazias a uma distância de mais de 50 metros. Também usa o seu casco pesado " +
                        "\npara atacar e esmagar seus oponentes.",

                "Tipo: Inseto \n\nDescrição: Como forma de proteção, Caterpie libera um cheiro horrível através de suas antenas. Suas patas " +
                        "\npegajosas são capazes de andar em qualquer tipo de superfície. Seu corpo é macio e fraco. " +
                        "\nNa natureza, é visto como alimento para vários pokémons pássaros. É fácil de capturar e cresce " +
                        "\nrapidamente, tornando-se uma das principais recomendações para treinadores novatos.",

                "Tipo: Inseto \n\nDescrição: Este pokémon é totalmente vulnerável a ataques enquanto seu casulo é mole, correndo risco de " +
                        "\nexpor seu corpo frágil e sensível. Por isso, fica endurecendo o seu casulo para se proteger. Batalhas intensas " +
                        "\ncom ele devem ser evitadas. Seu casulo é preenchido com um líquido espesso. Todas as células de seu corpo estão " +
                        "\nsendo reconstruídas em preparação para a evolução.",

                "Tipo: Inseto/Voador \n\nDescrição: Gosta de coletar mel das plantas. Suas asas batem tão rapidamente que acaba deixando um " +
                        "\nrastro de poeira tóxica pelo ar. As asas resistem a água, permitindo-o voar em fortes chuvas. Coleta mel todos os dias e " +
                        "\no leva para seu ninho. Um exame atento de seus olhos grandes revela que cada olho é composto por uma miríade de olhos minúsculos.",

                "Tipo: Inseto/Veneno \n\nDescrição: É frequentemente encontrado em florestas, comendo folhas. Em sua cabeça existe um ferrão afiado e " +
                        "\nvenenoso. Qualquer um pode se machucar com ele se não tomar cuidado onde pisa. Seu corpo de cores vivas tem o objetivo de alertar seus inimigos. " +
                        "\nWeedle tem um olfato extremamente aguçado. Ele é capaz de distinguir seus tipos favoritos de folhas daqueles de que não gosta apenas farejando.",

                "Tipo: Inseto/Veneno \n\nDescrição: Enquanto aguarda sua evolução, os Kakunas vivem agarrados em árvores para se esconder dos predadores. " +
                        "\nEmbora ainda seja um casulo, consegue se mexer um pouco. Quando em perigo, pode esticar o ferrão e envenenar o inimigo. " +
                        "\nNa maioria dos casos, só consegue endurecer seu casulo para se proteger.",

                "Tipo: Inseto/Veneno \n\nDescrição: Possui dois grandes ferrões nos braços e um em seu rabo. O ferrão de seu rabo é o mais venenoso. " +
                        "\nCostumam voar em altas velocidades e atacar em enxame. É extremamente territorial. " +
                        "\nNinguém deve se aproximar de seu ninho. Se irritados, eles atacarão furiosos e repetidamente.",

                "Tipo: Normal/Voador \n\nDescrição: Não gosta muito de lutar. Em vez disso, prefere bater as asas próximo ao chão para levantar \n" +
                        "uma poeira de areia e com isso afastar o inimigo. Possui um ótimo senso de direção. É capaz de retornar infalivelmente " +
                        "\npara seu ninho, por mais distante que possa ser removido de seu ambiente familiar. É comum de ser encontrado em florestas e bosques.",

                "Tipo: Normal/Voador \n\nDescrição: Ele é muito protetor de seu território, sempre irá atacar brutalmente qualquer intruso. " +
                        "\nPossui uma ótima visão, mesmo voando bem alto irá localizar sua presa. Suas garras afiadas e bastante desenvolvidas " +
                        "\nsão a sua arma de ataque. Ele pode carregar presas como um Exeggcute para seu ninho a mais de 100 km de distância.",

                "Tipo: Normal/Voador \n\nDescrição: É capaz de voar numa velocidade Mach 2. Suas grandes garras são temidas como armas perversas. " +
                        "\nEle desliza pela superfície da água em alta velocidade para pegar presas desavisadas como o Magikarp. " +
                        "\nCom seus músculos bem desenvolvidos, consegue fazer fortes furacões capazes de derrubar árvores ao bater suas asas. " +
                        "\nPossui uma plumagem deslumbrante de penas lindamente brilhantes.",

                "Tipo: Normal \n\nDescrição: Morde qualquer coisa quando está atacando. Vive procurando objetos duros para roer. Com sua forte " +
                        "\ncapacidade de sobrevivência, eles podem viver em lugares sujos sem preocupação. Se reproduzem muito depressa, podem virar uma praga nas cidades. " +
                        "\nSeus dentes crescem continuamente até sua morte. Se crescerem demais, não conseguem comer e morrem de fome.",

                "Tipo: Normal \n\nDescrição: Para assustar os adversários, ele posiciona-se de pé e mostra as presas de sua boca. Seus dentes são fortes, " +
                        "\ncapazes até mesmo de roer uma parede de concreto. Suas patas traseiras são palmadas, então é um nadador forte. " +
                        "\nPode atravessar rios e às vezes até oceanos. Não importa o quão amigável você seja, ele ficará zangado e o morderá se você tocar em seus bigodes.",

                "Tipo: Normal/Voador \n\nDescrição: Ele bate suas asas sobre a grama para encontrar insetos. Quando encontra, puxa-os do chão com o " +
                        "\nseu bico. Fazendeiros cujos campos são afetados por insetos apreciam Spearow pelo seu apetite por inseto. Suas asas são curtas, " +
                        "\npor isso não pode voar por longas distâncias. Sua natureza imprudente o fará enfrentar os outros, mesmo pokémons maiores, " +
                        "\nse tiver que proteger seu território. Seu grito pode ser ouvido a 1 km de distância.",

                "Tipo: Normal/Voador \n\nDescrição: Fearow é famoso por seu pescoço longo e bico comprido. Eles foram desenvolvidos especialmente " +
                        "\npara ajudá-lo a apanhar presas no solo ou na água. Adora comer pokémons peixes. Consegue manter-se voando no céu por bastante tempo " +
                        "\nsem pousar. Carregar comida pelo território de Fearow é perigoso. Ele vai tirar a comida de você!",

                "Tipo: Veneno \n\nDescrição: Rasteja silenciosamente pelo chão. Anda pela grama sem fazer barulho e atinge uma presa desavisada por trás. " +
                        "\nAlimenta-se de ovos nos ninhos de pokémons pássaros. Ele sente o cheiro com sua língua. " +
                        "\nSuas mandíbulas são capazes de devorar seres bem maiores que ele. Depois de uma refeição, ele se enrola e descansa.",

                "Tipo: Veneno \n\nDescrição: As marcas no pescoço de Arbok podem ser diferentes de região para região. Elas indicam o quão venenoso este pokémon é. " +
                        "\nInimigos fracos fugirão apenas ao ver essas marcas. Ele também pode sufocar suas vítimas enrolando-se em torno delas. " +
                        "\nSua força ao enrolar pode espremer tambores de aço.",

                "Tipo: Elétrico \n\nDescrição: Para ter uma melhor percepção de tudo o que está em sua volta, mantém o seu rabo levantado. " +
                        "\nEle armazena energia elétrica dentro de suas bochechas vermelhas. Quando dois deles se encontram, eles tocam suas caudas " +
                        "\ne trocam eletricidade através deles como uma forma de saudação. As florestas onde vivem Pikachu são perigosas, " +
                        "\npois as árvores são frequentemente atingidas por raios.",

                "Tipo: Elétrico \n\nDescrição: Pode tornar-se agressivo caso acumule muita eletricidade no corpo. Pode dar choques de até dez mil volts. " +
                        "\nEle mantém o seu longo rabo no solo para controlar seus raios elétricos e descarregar eletricidade. Se suas bolsas elétricas " +
                        "\nficarem vazias, ele levanta a cauda para coletar eletricidade da atmosfera. Ele pode brilhar no escuro.",

                "Tipo: Terrestre \n\nDescrição: Faz sua toca no subterrâneo, longe de água. Geralmente sai apenas para caçar. Se ele cair de uma grande altura, " +
                        "\nconsegue se salvar enrolando o corpo e rolando como uma bola. Ele adora banhar-se na areia de áreas secas e arenosas. fazendo isso, " +
                        "\nse livra da sujeira e da umidade presa em seu corpo. Ele se enterra no solo para criar seu ninho. " +
                        "\nSe pedras duras impedem sua escavação, ele usa suas garras afiadas para espalhá-los.",

                "Tipo: Terrestre \n\nDescrição: Suas costas possuem espinhos muito duros, usados como sua defesa. É habilidoso para fazer arranhões com suas garras. " +
                        "\nSe as garras ou espinhos quebrarem, irão crescer de novo em um dia. Ele usa suas garras para escalar árvores e então enrola seu corpo " +
                        "\nem uma bola espinhosa, pronta para cair sobre qualquer presa que apareça.",

                "Tipo: Veneno \n\nDescrição: As fêmeas de Nidoran possuem chifres menores. Embora pequena, deve se ter muito cuidado com os espinhos venenosos " +
                        "\nde seu corpo. Ela não gosta muito de lutar. As fêmeas são mais sensíveis a cheiros do que os machos. Usam seus bigodes para verificar a " +
                        "\ndireção do vento e ficar a favor dos predadores. Ela usa seus dentes incisivos duros para esmagar e comer frutas. " +
                        "\nSe enfurecida, libera uma toxina horrível de seu chifre.",

                "Tipo: Veneno \n\nDescrição: O chifre em sua cabeça desenvolve-se lentamente. Ela prefere golpear com ataque físicos, como mordidas e arranhões. " +
                        "\nÉ dócil, mas não hesita em atacar quando perturbada. Emite gritos ultrassônicos que têm o poder de confundir os inimigos. Se o grupo for " +
                        "\nameaçado, se unem para atacar o inimigo. O chifre em sua cabeça atrofiou. Pensa-se que isso aconteça para que os filhotes de " +
                        "\nNidorina não sejam cutucados enquanto a mãe os estiver alimentando.",

                "Tipo: Veneno/Terrestre \n\nDescrição: Duras escamas crescem no corpo robusto deste pokémon. Isso lhe permite realizar movimentos brutais. " +
                        "\nÉ perito em enviar inimigos voando com ataques violentos. Ela defende a sua cria com sua própria vida. É melhor na defesa do que no ataque. " +
                        "\nEla acalma a sua prole, colocando-os nas lacunas entre os espinhos em suas costas. Os espinhos nunca secretarão veneno enquanto " +
                        "\nos pequenos estiverem presentes.",

                "Tipo: Veneno \n\nDescrição: Ele endurece suas orelhas para sentir o perigo. Com elas, examina os arredores e consegue escutar " +
                        "\no mais leve dos sons. As orelhas podem ser movidas livremente em qualquer direção. Quanto maior for o seu chifre, mais venenoso ele será. " +
                        "\nPequeno mas corajoso, irá manter-se firme e até arriscar a sua vida na batalha para proteger a fêmea de quem é amigo.",

                "Tipo: Veneno \n\nDescrição: Possui um chifre mais duro que diamante. Sai por aí quebrando pedras enquanto procura uma pedra da lua. " +
                        "\nCaso ele sinta alguma presença hostil, todas as farpas de suas costas irão erguer-se de uma só vez. " +
                        "\nSuas picadas podem ser fatais. A potência de seu veneno aumenta junto com o nível de adrenalina presente em seu corpo.",

                "Tipo: Veneno/Terrestre \n\nDescrição: Utiliza-se de sua cauda poderosa para bater e enrolar seus oponentes. Combates corpo a corpo são a " +
                        "\nsua especialidade. Com um golpe, ele pode derrubar uma torre de transmissão de metal. Seu chifre é capaz de perfurar diamantes. " +
                        "\nÉ reconhecido por sua pele dura como pedra e seu chifre alongado. Quando faz um alvoroço, é impossível controlar. " +
                        "\nSe acalma na presença de uma Nidoqueen com quem vive há muito tempo.",

                "Tipo: Fada \n\nDescrição: A luz lunar que pode absorver com suas asas aparentemente lhe dá a capacidade de voar. Raramente é encontrado, " +
                        "\nvive em locais específicos. Costumam sair de seus esconderijos em noites de lua cheia para dançar. Dizem que a felicidade virá para " +
                        "\naqueles que virem um grupo de Clefairy dançando sob a lua cheia. Seu comportamento e aparência " +
                        "\nadoráveis o tornam popular entre homens e mulheres, jovens e idosos.",

                "Tipo: Fada \n\nDescrição: Um pokémon muito tímido, foge sempre que percebe estar sendo observado. Ele dá leves saltos para se locomover, " +
                        "\npermitindo-o passear sobre lagos em noites de luar. Seus ouvidos são sensíveis o suficiente para ouvir o barulho de um alfinete caindo " +
                        "\na 1 km de distância. Vivem em locais silenciosos, como montanhas. As pessoas que vêem um par de Clefable passando podem esperar um casamento feliz.",

                "Tipo: Fogo \n\nDescrição: Quando nasce, possui apenas um rabo. Ele vai se dividindo conforme for envelhecendo. Conforme cada rabo cresce, " +
                        "\nseu pelo se torna mais lustroso. Astuto, para fugir do perigo, finge estar debilitado e engana o adversário. Dentro do corpo de " +
                        "\nVulpix queima uma chama que nunca se apaga. Eles expelem chamas que se assemelham aos espíritos dos mortos. Algumas pessoas pensam que este fogo é um fantasma.",

                "Tipo: Fogo \n\nDescrição: É extremamente vingativo. Dizem que cairá uma maldição de mil anos sobre aquele que puxar uma de suas caudas por brincadeira. " +
                        "\nAcredita-se que cada uma de suas nove caudas possui um poder místico especial. Diz a lenda que este pokémon místico foi formado quando nove santos " +
                        "\nse uniram em um. As chamas que solta de sua boca deixam seus oponentes hipnotizados. Então, aproveita para atacar. A vida de Ninetales dura mil anos.",

                "Tipo: Normal/Fada \n\nDescrição: Seus grandes olhos são usados para encantar o inimigo. Depois, canta uma bela melodia que coloca o adversário para dormir. " +
                        "\nEle pode inflar o corpo como um balão e sair flutuando. Possui um alcance vocal que ultrapassa 12 oitavas, mas a habilidade de canto de cada indivíduo " +
                        "\ndepende de seu próprio esforço. Tem uma capacidade pulmonar excelente. Gravações das canções de ninar de Jigglypuff podem ser compradas em lojas de departamentos.",

                "Tipo: Normal/Fada \n\nDescrição: Sua pele é macia e seu corpo é bastante flexível. Quando está com raiva, consegue inalar o ar repetidas vezes, inflando seu " +
                        "\ncorpo cada vez mais. Faz isso para intimidar os inimigos. Às vezes, eles podem crescer 20 vezes o seu tamanho! Seu pelo é fino e delicado. A mecha em sua " +
                        "\ntesta tem uma textura celestial. Ele perde seu pelo fino quando as estações mudam. Seus olhos, cobertos por uma fina camada de lágrimas, repelem a poeira.",

                "Tipo: Veneno/Voador \n\nDescrição: Sua audição é bem apurada. Para identificar aquilo que estiver em seu caminho, Zubat solta de sua boca ondas ultrassônicas. " +
                        "\nIsso lhe permite voar com segurança mesmo em locais escuros. De manhã, eles se reúnem em cavernas para se aquecerem enquanto dormem. Quando expostos " +
                        "\nao sol, sofrem queimaduras. A frequência de suas ondas ultrassônicas pode variar ligeiramente de colônia para colônia.",

                "Tipo: Veneno/Voador \n\nDescrição: Com os dentes bastante afiados, morde suas vítimas para sugar o sangue. Ele não irá parar de drenar a energia da vítima " +
                        "\naté estar satisfeito. Se chupa muito sangue, fica pesado e voa desajeitadamente. Dizem que, se encontrar um dos seus passando fome, compartilha o sangue que coletou. " +
                        "\nEles podem sugar mais de 300 gramas de sangue de uma só vez. Seus dentes são ocos como canudos, tornando-os inesperadamente frágeis",

                "Tipo: Planta/Veneno \n\nDescrição: Durante o dia costuma ficar enterrado no chão, deixando apenas as suas folhas expostas. Ele irá berrar caso alguém tente arrancá-lo de lá. " +
                        "\nQuanto mais fértil o solo, mais brilhantes se tornam suas folhas. À noite sai para espalhar suas sementes. Dizem que caminha por 300 metros fazendo isso. Ele cresce ao se banhar ao luar.",

                "Tipo: Planta/Veneno \n\nDescrição: O fedor proveniente da flor de sua cabeça pode ser sentido à distância. Pode causar desmaios a 2 km. Ele fede mais ainda quando se sente ameaçado. " +
                        "\nUma a cada mil pessoas irá gostar do seu cheiro. Se estiver calmo e seguro, não vai liberar seu aroma fedorento. A baba que escorre de sua boca na verdade é um néctar pegajoso.",

                "Tipo: Planta/Veneno \n\nDescrição: Quanto maiores forem as suas pétalas, mais tóxico será o pólen contido nelas. Elas são tão pesadas que é difícil para ele aguentar. Ao sacudir " +
                        "\nas pétalas, o ar ao seu redor fica amarelo. Dizem que possui as maiores pétalas do mundo. O pólen tóxico de Vileplume desencadeia ataques de alergia atrozes. " +
                        "\nÉ aconselhável nunca se aproximar de flores atraentes na selva, por mais bonitas que sejam.",

                "Tipo: Inseto/Planta \n\nDescrição: Paras se enterra sob o solo para roer as raízes das árvores. Cogumelos parasita chamados tochukaso crescem nas costas de Paras. " +
                        "\nNão importa o quanto Paras coma, os cogumleos absorvem nutrientes deste hospedeiro. São altamente valorizados como remédios para prolongar a vida.",

                "Tipo: Inseto/Planta \n\nDescrição: Parasect está quase morto, sendo totalmente controlado pelo cogumelo que cresceu em suas costas. O cogumelo parece fazer todo o " +
                        "\npensamento. Graças a ele, vive em locais úmidos e escuros. Ele solta esporos tóxicos por onde passa. Depois de colhidos, esses esporos podem ser mergulhados " +
                        "\ne fervidos para preparar medicamentos fitoterápicos. Muitas vezes, Parasect disputa território com Shiinotic.",

                "Tipo: Inseto/Veneno \n\nDescrição: Seus olhos grandes podem atuar como radares. Eles são compostos por diversos outros olhos menores. São ótimos para " +
                        "\nenxergar no escuro ou ver coisas minúsculas. À noite, sua espécie é atraída pela luz. Vive nas sombras de árvores altas, onde se alimenta " +
                        "\nde insetos. Possui uma camada de cabelo fino e duro que cobre todo o corpo para proteção.",

                "Tipo: Inseto/Veneno \n\nDescrição: As asas são cobertas por escamas semelhantes a poeira. Quando ele ataca, bate suas grandes asas escuras violentamente " +
                        "\npara espalhar seu pó venenoso por todos os lados. Se suas asas tiverem uma coloração mais clara, seu pó é paralisante. Sua presa favorita são " +
                        "\npequenos insetos que se aglomeram ao redor dos postes de luz, atraídos pela luz na escuridão.",

                "Tipo: Terrestre \n\nDescrição: Passa a maior parte do tempo enterrado no subsolo. Ele deixa terra elevada em seu rastro, facilitando sua localização. " +
                        "\nSeu método de escavação pode deixar um campo perfeito para o cultivo. Muitos fazendeiros o valorizam pois suas fezes enriquecem o solo. " +
                        "\nEle se alimenta das raízes das árvores. Ele prefere lugares escuros, passando a maior parte do tempo no subsolo.",

                "Tipo: Terrestre \n\nDescrição: Dugtrio são realmente trigêmeos que surgiram de um corpo. Como resultado, cada indivíduo pensa exatamente como os outros " +
                        "\ndois. Eles trabalham cooperativamente para escavar sem parar. Ele desencadeia terremotos gigantes cavando a 100 km abaixo da terra. " +
                        "\nEm raras ocasiões, uma grande briga acontecerá sobre qual cabeça comerá primeiro. Ninguém nunca viu as partes dele escondidas no subsolo.",

                "Tipo: Normal \n\nDescrição: Meowth retira suas garras afiadas das patas para silenciosamente esgueirar-se furtivamente sem deixar nenhum rastro. " +
                        "\nTem hábitos noturnos. Por alguma razão, este pokémon ama objetos brilhantes, em especial as moedas. Se estiver de bom humor, pode até " +
                        "\ndeixar seu treinador dar uma olhada em seu tesouro. Lava o rosto regularmente para manter a moeda na testa sem manchas.",

                "Tipo: Normal \n\nDescrição: Tem um temperamento vicioso. Cuidado se ele levanta a cauda. É um sinal de que ele está prestes a atacar e morder. " +
                        "\nEmbora seu pelo tenha muitos admiradores, é difícil criar como um animal de estimação por causa de sua mesquinhez. É difícil sua " +
                        "\nconquistar amizade, logo irá te arranhar no memento em que for irritado. É alvo de caçadores que estão atrás da joia em sua testa. " +
                        "\nA relação dele com Perrserker é de mútuo desdenho.",

                "Tipo: Água \n\nDescrição: Oprimido por habilidades enigmáticas, ele sofre uma dor de cabeça constante. Quando sua dor de cabeça chega ao ápice, " +
                        "\nele usa seus misteriosos poderes psíquicos para mandar pra longe o que está o irritando. Se ele usa seu poder misterioso, Psyduck não se lembra de tê-lo feito. " +
                        "\nAparentemente, ele não consegue formar uma memória de tal evento porque entra em um estado alterado que é muito parecido com o sono profundo.",

                "Tipo: Água \n\nDescrição: \tEle é visto nadando de forma dinâmica e elegante usando seus membros e nadadeiras bem desenvolvidos. É constantemente " +
                        "\nconfundido com o Kappa, um assassino monstro japonês. Velhos contos falam de Golduck punindo os que contaminaram seu rio, arrastando-os para a água e levando-os embora. " +
                        "\nDizem que a parte vermelha de sua testa concede poderes sobrenaturais àqueles que o possuem, por isso foi muito caçado no passado.",

                "Tipo: Lutador \n\nDescrição: Vive em colônias nas copas das árvores. Se você enfurecer um deles, vai ter que lidar com um bando furioso de Mankey. " +
                        "\nNão é seguro se aproximar dele quando está violento e furioso por nenhum motivo, pois quando isso acontece, ele não consegue distinguir " +
                        "\namigos de inimigos. Sua fúria o cansa e o faz adormecer, mas a raiva que ressoa em seus sonhos o faz acordar, o enfurecendo novamente.",

                "Tipo: Lutador \n\nDescrição: Se você se aproximar enquanto ele dorme você pode acabar acordando-o, começando assim uma furiosa caçada " +
                        "\ncom esse primata bêbado de sono. Ele persegue qualquer um que faça contato visual. Ele nunca perdoará os oponentes que o irritaram. " +
                        "\nQuando Primeape fica furioso, sua circulação sanguínea aumenta. Por sua vez, seus músculos ficam ainda mais fortes. Ele morre de tanta raiva, mas seu rosto parece em paz na morte.",

                "Tipo: Fogo \n\nDescrição: Um pokémon naturalmente leal, fiel e obediente. Ele permanece imóvel até receber ordem de seu treinador. Se ordenado, ele não hesitará em atacar inimigos maiores e mais fortes, porém seu senso de justiça impede que ele ataque imediatamente oponentes mais fracos e menores. " +
                        "Latirá sem medo para proteger seu treinador em perigo. Tem um olfato excelente. Assim que sentir algum cheiro, jamais esquecerá.",

                "Tipo: Fogo \n\nDescrição: Este lendário pokémon chinês é considerado magnífico. Muitas pessoas se encantam por sua enorme juba. Seu imponente " +
                        "\nlatido transmite uma ideia de líder. Todos que ouvem não podem fazer nada além de se ajoelhar para sua majestade. " +
                        "\nÉ conhecido por sua alta velocidade, podendo correr 10.000 km em um dia e uma noite. O fogo queimando dentro de seu corpo é sua fonte de energia.",

                "Tipo: Água \n\nDescrição: Sua pele é tão fina que se você prestar bastante atenção você consegue enxergar seus órgãos internos. " +
                        "\nO espiral em sua barriga é, na verdade, parte de suas vísceras aparecendo através da pele. A direção do giro desse espiral " +
                        "\ndifere dependendo de onde eles vivem. Eles possuem dificuldade para andar com seus pés recém-crescidos e por isso tropeçam " +
                        "\ntoda hora. São melhores nadando.",

                "Tipo: Água \n\nDescrição: \tA espiral na sua barriga gira sutilmente. Olhar para essa espiral pode te deixar desde sonolento até, no " +
                        "\nmáximo, hipnotizado. Suas duas pernas são bem desenvolvidas, logo ele não tropeça mais. Pode viver tranquilamente na terra, mas " +
                        "\nele prefere viver na água. Seu suor é um muco viscoso. Se for pego, irá escorregar nas mãos do inimigo e escapar. Sua saúde " +
                        "\né prejudicada quando a pele seca, precisa estar sempre hidratado.",

                "Tipo: Água/Lutador \n\nDescrição: Poliwrath tem um corpo altamente desenvolvido e não importa o quão exaustivo é o trabalho, seus músculos " +
                        "\nnunca ficam cansados. É tão incansavelmente forte que ele pode nadar de um lado ao outro do Oceano Pacífico sem fazer muito esforço. " +
                        "\nEle desenvolve seus músculos através da natação. É bom em nado de peito e nado de crawl. Ao nadar em mares frios, usa seus braços para quebrar o gelo à deriva.",

                "Tipo: Psíquico \n\nDescrição: Ele usa seus poderes psíquicos enquanto dorme. Usar poderes psíquicos causa tanta tensão em seu cérebro que ele " +
                        "\nprecisa dormir 18 horas por dia. Por essa razão, é difícil ver um Abra usando qualquer golpe diferente do teletransporte. Quanto mais " +
                        "\nprofundo for o seu sono, mais pra longe se teletransporta. Quando acorda, não sabe onde está, então entra em pânico. Também consegue " +
                        "\nler a mente dos outros.",

                "Tipo: Psíquico \n\nDescrição: Logo após evoluir seu poder mental aumenta deixando ele utilizar vários golpes psíquicos poderosos, porém que " +
                        "\nprecisam de maior concentração. Ele olha para a sua colher de prata para esvaziar sua mente e acaba emitindo mais ondas alfa. " +
                        "\nExistem rumores que um menino que usava poderes psíquicos se transformou nesse pokémon. A presença de Kadabra infesta televisões " +
                        "\ne monitores com sombras assustadoras que trazem azar.",

                "Tipo: Psíquico \n\nDescrição: Dizem que as colheres em suas mãos foram feitas com seus poderes psíquicos. Seu cérebro é tão grande que dizem " +
                        "\nque é o pokémon mais inteligente que já existiu. Seu QI é de aproximadamente 5.000. Alguns dizem que Alakazam se lembra de tudo o que " +
                        "\nacontece com ele, do nascimento até a morte. Suas células cerebrais continuam a aumentar até sua morte. Quanto mais velho o Alakazam, maior será sua cabeça.",

                "Tipo: Lutador \n\nDescrição: Embora seja baixinho, ele é forte o suficiente para levantar e arremessar uma série de Geodudes de uma só vez. Ele " +
                        "\nadora malhar. Para ficar mais forte, ele ergue repetidamente um Graveler usando uma mão só. Com sua força sobre-humana, é capaz de derrubar " +
                        "\ncem pessoas ao mesmo tempo. Gosta de alimentos altamente nutritivos porque os seus instintos o levam a construir músculos de forma eficiente.",

                "Tipo: lutador \n\nDescrição: \tO poder ilimitado de Machoke é muito perigoso, por isso usa um cinto que suprime a sua energia. Usando esse poder, " +
                        "\nele ajuda as pessoas com trabalhos pesados. Ele faz isso porque sabe que o trabalho é um bom treinamento para seus músculos. Ele é muito " +
                        "\nprocurado por pedreiros e engenheiros. Ao encontrar um inimigo verdadeiramente poderoso, este pokémon remove o cinto da cintura e libera todo o seu poder.",

                "Tipo: lutador \n\nDescrição: \tSeus quatro braços musculosos acertam seus inimigos com socos potentes e cortes em uma velocidade estonteante. " +
                        "\nEle pode dar até mil socos em apenas dois segundos. Com quatro braços, pode atacar e defender simultaneamente. Dizem que domina todas " +
                        "\nas artes marciais do mundo. Seus dedos desajeitados o impedem de fazer qualquer trabalho que requeira cuidado e destreza.",

                "Tipo: Planta/Veneno \n\nDescrição: \tEle planta seus pés profundamente no subsolo para se reabastecer com água. Prefere ambientes quentes e úmidos. " +
                        "\nEmbora seu corpo seja extremamente magro, ele rapidamente captura sua presa com suas vinhas. Ele consegue se curvar e balançar para evitar " +
                        "\nqualquer ataque, por mais forte que seja. Seu botão de flor parece um rosto humano. Por causa do botão, dizem que é um tipo de planta de mandrágora lendária.",

                "Tipo: Planta/Veneno \n\nDescrição: Um pokémon que parece ser uma planta para capturar presas desavisadas nocauteando-as com um pó venenoso. " +
                        "\nOs músculos de sua boca são bastante desenvolvidos. Ele cospe um fluido que dissolve tudo. As partes com folhas atuam como cortadores " +
                        "\npara cortar os inimigos. À noite, ele se engancha em um galho de árvore e vai dormir.",

                "Tipo: Planta/Veneno \n\nDescrição: Ele tem uma “piscina” em sua boca com um fluido com cheiro de mel que é na verdade um ácido que digere qualquer " +
                        "\ncoisa. O ácido que se dissolveu muitas presas se torna mais doce, tornando ainda mais eficiente para atraí-las. Dizem que vive em enormes " +
                        "\ncolônias nas selvas, embora ninguém jamais tenha voltado para contar. Possui uma longa trepadeira que se estende desde sua cabeça. " +
                        "\nQuando uma presa se aproxima, ele a engole inteira.",

                "Tipo: Água/Veneno \n\nDescrição: Seu corpo é 99% composto de água. O 1% restante contém o órgão que fabrica seu veneno. Ele dispara feixes estranhos " +
                        "\nde seus olhos que parecem cristais. Incontáveis pescadores são feridos por seu ferrão todo dia. Seus tentáculos venenosos se quebram às vezes, " +
                        "\nmas depois de um tempo, eles voltam a crescer. Alguns são encontrados desidratados na praia. Basta colocá-los na água para reanimá-los.",

                "Tipo: Água/Veneno \n\nDescrição: Ele estende seus 80 tentáculos para formar redes de cerco venenoso que é difícil escapar. Seus tentáculos absorvem a água " +
                        "\ne esticam quase infinitamente para prender suas presas e inimigos. Seus tentáculos são curtos, estica apenas para caçar. Quanto mais velho, menos " +
                        "\ntentáculos terá. Quando as orbes vermelhas na cabeça de Tentacruel brilharem intensamente, tome cuidado. Ele está prestes a disparar uma explosão de ondas ultrassônicas.",

                "Tipo: Pedra/Terrestre \n\nDescrição: Muitos vivem por trilhas das montanhas e permanecem semi-enterrados, mantendo um olho em escaladores. Essa atitude " +
                        "\nfaz com que sejam confundidos por pedras na maioria das vezes. Ele se choca contra os outros em disputas de dureza. Quanto mais tempo um Geodude " +
                        "\nvive, mais suas bordas são lascadas e gastas, tornando-o mais arredondado na aparência. De manhã, rola ladeira abaixo em busca de comida.",

                "Tipo: Pedra/Terrestre \n\nDescrição: Ele caminha muito devagar, logo ele rola para se locomover. Ele não presta atenção em nenhum objeto que passa em " +
                        "\nseu caminho. Com uma natureza livre e indiferente, ele não se importaria se pedaços quebram enquanto ele desce montanhas. Com impulso suficiente, " +
                        "\nsua velocidade pode ultrapassar 100 km/h. Rochas cobertas de musgo são sua comida favorita. Pode devorar uma tonelada por dia.",

                "Tipo: Pedra/Terrestre \n\nDescrição: Nem dinamite pode explodir seu resistente corpo de pedra. Quando está rolando, nada pode pará-lo e ele não para " +
                        "\npor nada. Ele detona seu próprio corpo. O poder dessa explosão pode impulsioná-lo por caminhos de montanha íngremes com velocidade incrível. " +
                        "\nEle pode facilmente rolar por cima da lava sem se queimar ou afundar. Uma vez por ano, ele passa por uma muda e seu casco retorna ao solo.",

                "Tipo: Fogo \n\nDescrição: Exímios corredores, eles sempre ganham corridas de velocidade. Porém se competir com um Ponyta bebê dificilmente irá perder. " +
                        "\nOs bebês não correm muito bem. Conforme ele corre com outros de sua espécie, suas pernas ficam mais fortes. Seu fogo só queima quem com " +
                        "\nele teima. Se você foi aceito por Ponyta, sua crina em chamas não será mais quente ao toque.",

                "Tipo: Fogo \n\nDescrição: Com uma grande aceleração, ele alcança sua velocidade máxima, 240 km/h, em apenas 10 passos. Com a sua juba flamejando ferozmente, " +
                        "\nele corre como se fosse uma flecha. O corredor mais rápido se torna o líder e decide o ritmo do rebanho e a direção da viagem. " +
                        "\nMuito competitivo, perseguirá qualquer coisa que se mova rápido na esperança de competir com ela.",

                "Tipo: Água/Psíquico \n\nDescrição: Ele é tão inteligente quanto um Wobbuffet e tão veloz quanto um Caterpie. Apesar de lerdo, ele é muito habilidoso com " +
                        "\nsua cauda. Ele a utiliza para pescar. Não sente dor se alguém morder ou arrancar sua cauda e não perceberá quando ela crescer de volta. " +
                        "\nSuas caudas são um ingrediente precioso para culinária. Uma crença antiga dizia que sempre que Slowpoke boceja, chove.",

                "Tipo: Água/Psíquico \n\nDescrição: Quando um Shellder morde a cauda de Slowpoke ele se torna um lesado Slowbro, se o Shellder é retirado durante uma " +
                        "\nbatalha ele volta a ser um Slowpoke. Shellder, em sua avidez por sugar cada vez mais doçura da cauda de Slowbro, se metamorfoseou em uma concha " +
                        "\nem forma de espiral. Slowbro adora olhar para o vazio. Sempre que Shellder morde seu rabo com força, dá a ele um lampejo de inspiração… que ele esquece um momento depois.",

                "Tipo: Elétrico/Metálico \n\nDescrição: Ele usa ondas eletromagnéticas para flutuar, porém isso não impede que ele receba um enorme dano de golpes " +
                        "\nterrestres. Alimenta-se de eletricidade. Eles se reúnem em locais onde há eletricidade. Ele emite ondas eletromagnéticas dos imãs em cada " +
                        "\nlado do corpo. Às vezes, Magnemite fica sem eletricidade e acaba no chão. Se você der baterias para um Magnemite aterrado, ele começará a se mover novamente.",

                "Tipo: Elétrico/Metálico \n\nDescrição: Ele é resultado de uma junção de três Magnemite unidos pelo magnetismo. Ao se unirem, seus cérebros também " +
                        "\nse tornam um. Um grupo de Magneton pode causar uma tempestade magnética. A maioria dos computadores enlouquece quando um deles se aproxima. " +
                        "\nEnvia ondas de rádio poderosas para estudar seus arredores. Surtos desse pokémon acontecem quando muitas manchas solares aparecem.",

                "Tipo: Normal/Voador \n\nDescrição: Ele nunca vai a luta sem seu fiel toco de alho-poró. Ele serve como uma espada para cortar todos os tipos " +
                        "\nde coisas. Ele só come seu alho-poró em casos de emergência e mesmo assim logo acha um substituto. Também pode usar o alho-poró para " +
                        "\nconstruir seu ninho. Eles vivem onde crescem as plantas de alho-poró. Farfetch’d raramente é visto, então pensa-se que seu número esteja diminuindo.",

                "Tipo: Normal/Voador \n\nDescrição: Os cérebros de sua cabeça compartilham emoções por telepatia. Eles também compartilham a fome e estão constantemente " +
                        "\nbrigando entre si por comida. Percorre planícies relvadas com passadas poderosas, deixando pegadas de até dez centímetros de profundidade. " +
                        "\nAs duas cabeças de Doduo nunca dormem ao mesmo tempo. Elas se revezam, uma cabeça vigia os inimigos enquanto a outra dorme.",

                "Tipo: Normal/Voador \n\nDescrição: Quando Doduo evolui, uma de suas cabeças se divide em duas. Essas duas cabeças compartilham as mesmas memórias. " +
                        "\nEle pode correr a 60 km/h. Suas cabeças representam alegria, fúria e tristeza. Cuidado se as três cabeças de Dodrio estão olhando em " +
                        "\ntrês direções diferentes. É um sinal claro de que está em guarda. Além de 3 cabeças, possui 3 pares de pulmões e 3 corações, que lhe permitem correr longas distâncias sem descanso.",

                "Tipo: Água \n\nDescrição: Um pokémon que vive em icebergs. O chifre de sua cabeça é bastante duro, capaz de perfurar o mar congelado. Mergulha para caçar. " +
                        "\nUsa o chifre para quebrar as geleiras e voltar a superfície. Adora viver num clima frio. Não consegue andar bem em terra, porém é um ótimo nadador. " +
                        "\nGraças à sua gordura espessa, os mares frios não o incomodam em nada, mas cansa-se facilmente em águas quentes.",

                "Tipo: Água/Gelo \n\nDescrição: Armazena uma energia térmica em seu corpo. Mesmo num frio intenso permanece ileso, conseguindo nadar poderosamente " +
                        "\nem águas geladas. Quanto mais fria a temperatura, mais agitado ele fica. Consegue se camuflar bem na neve. Dewgong adora cochilar " +
                        "\nno gelo extremamente frio. Toma banho de sol após as refeições. O aumento da temperatura corporal ajuda a digestão.",

                "Tipo: Veneno \n\nDescrição: As plantas deixarão de nascer por onde passar. Enquanto caminha, pedaços de seu corpo podem ficar para trás, " +
                        "\nformando novos Grimers. Gosta de viver nos esgotos das cidades. Sua principal fonte de alimento são os resíduos industriais viscosos das fábricas. " +
                        "\nEle nasceu da lama transformada pela exposição aos raios X da lua. Quando sua carga interna de germes diminui, ele morre.",

                "Tipo: Veneno \n\nDescrição: Um pokémon sujo e feito de lama. É tão tóxico que mesmo suas pegadas contém veneno. Seu cheiro é tão horrível " +
                        "\nque pode causar desmaios. Sua comida favorita é qualquer coisa repugnantemente suja. Como eles espalham germes por toda parte, " +
                        "\nsão alvos de extermínio, levando a um declínio em sua população. Após as recentes melhorias ambientais, quase não é mais " +
                        "\nvisto. As pessoas especulam que pode ser extinto em algum momento.",

                "Tipo: Água \n\nDescrição: Sua concha dura repele qualquer tipo de ataque. É vulnerável somente quando sua concha é aberta. Grãos de " +
                        "\nareia que caem em sua concha podem se tornar pérolas com os fluídos de seu corpo. Como a pérola o atrapalha, ele logo a cospe. " +
                        "\nNada voltado para trás, abrindo e fechando sua concha. Mesmo quando sua concha está fechada, sua língua ainda fica para fora. " +
                        "\nDê um bom puxão e o choque fará com que Shellder abra a concha.",

                "Tipo: Água/Gelo \n\nDescrição: Sua concha é tão dura quanto diamante, ele a utiliza como forma de defesa. Não pode ser destruída, mesmo com " +
                        "\numa bomba. Se áreas da concha forem danificadas, essas áreas incham, crescendo gradualmente em grandes espinhos afiados. Ele agarra " +
                        "\nseus inimigos fechando a concha. Pode lançar vários espinhos a partir dela. Ninguém nunca viu como são suas entranhas. " +
                        "\nNada no mar engolindo água e depois jogando-a para trás.",

                "Tipo: Fantasma/Veneno \n\nDescrição: Seu corpo é todo feito de gás. Nunca irão surgir quando venta muito, pois acabam sendo levados pelo vento. " +
                        "\nSua pele é venenosa e pode enfraquecer qualquer um que entrar em contato. Qualquer um desmaiará se for engolfado por seu corpo gasoso, " +
                        "\nque contém veneno. O gás venenoso compreende 95% de seu corpo. Dizem que os 5% restantes são almas daqueles que morreram ao aspirar o gás.",

                "Tipo: Fantasma/Veneno \n\nDescrição: Consegue atravessar paredes e usar sua língua para paralisar os outros. Se você tem a sensação de estar sendo " +
                        "\nobservado na escuridão, tropeçar do nada ou escutar um ruído quando ninguém está por perto, pode ser um Haunter aprontando. Sua língua é " +
                        "\nfeita de gás. Se lambido, sua vítima começa a tremer constantemente até que a morte venha. Tem medo da luz e deleita-se com a escuridão.",

                "Tipo: Fantasma/Veneno \n\nDescrição: Em noites de lua cheia, este pokémon sai para imitar as sombras das pessoas e assustá-las. Caso você sinta um " +
                        "\ncalafrio repentino, quer dizer que há um Gengar por perto. Emerge das trevas para roubar a vida daqueles que se perderam nas montanhas. " +
                        "\nComo já foi humano, ele tenta criar um companheiro de viagem tirando a vida de outros humanos. Contos dizem que Gengar fará uma visita às crianças que são travessas.",

                "Tipo: Pedra/Terrestre \n\nDescrição: Conforme vai crescendo, seu corpo rochoso vai ficando cada vez mais duro. Ele consegue cavar no solo em uma " +
                        "\nvelocidade de 80 km/h, girando e contorcendo as pedras de seu corpo para isso. À medida que cava no solo, ele absorve muitos objetos duros. " +
                        "\nÉ isso que torna seu corpo tão sólido. Onix tem um ímã em seu cérebro. Ele atua como uma bússola para que o pokémon não perca a direção durante o túnel.",

                "Tipo: Psíquico \n\nDescrição: Coloca seus oponentes para dormir e em seguida come os seus sonhos. Algumas vezes acaba ficando doente por comer sonhos " +
                        "\nruins. Parece que os pesadelos têm gosto azedo. Quando faz amizade com outras pessoas, pode mostrar-lhes os sonhos mais deliciosos que já teve. " +
                        "\nAcredita-se que ele tenha ancestrais comuns com Munna e Musharna. Se você teve um sonho bom, mas não consegue se lembrar, provavelmente um Drowzee o comeu.",

                "Tipo: Psíquico \n\nDescrição: Caso você encontrar um desses, evite o contato olho a olho. Ele vai tentar fazer dormir usando seu pêndulo. Seus poderes " +
                        "\nhipnóticos são bastante desenvolvidos. As pessoas que precisam de um sono profundo o chamam de seu salvador. Existem alguns Hypnos que ajudam " +
                        "\nmédicos com pacientes que não conseguem dormir à noite em hospitais. Certa vez, houve um incidente em que levou uma criança que o hipnotizou.",

                "Tipo: Água \n\nDescrição: Ele pode ser encontrado perto do mar. Nas praias, costuma se enterrar em buracos cavados na areia. Suas pinças, além de serem " +
                        "\numa arma poderosa, servem de equilíbrio para andar de lado. Se uma pinça cair, irá nascer uma nova e mais resistente. Ele fica espumando " +
                        "\na boca quando se sente ameaçado. Em praias com pouca comida, disputam entre si por território.",

                "Tipo: Água \n\nDescrição: Sua garra cresceu maciçamente e tão duro quanto aço. Porém, por ser muito pesada, é difícil manuseá-la. Ela tem uma " +
                        "\npotência de 10.000 cavalos. Ele agita sua enorme garra no ar para se comunicar com os outros. Por ser muito grande, logo fica cansado. " +
                        "\nSe ele levantar a pinça muito rápido, ele perde o equilíbrio e cambaleia.",

                "Tipo: Elétrico \n\nDescrição: Normalmente encontrados em usinas de energia. Muitas vezes é confundido com uma pokébola e acaba dando choque em pessoas. Ele pode até explodir em alguns casos. Foi avistado pela primeira vez em uma empresa que fabrica pokébolas. " +
                        "Há rumores de que foi criado quando uma pokébola foi exposta a um poderoso pulso de energia.",

                "Tipo: Elétrico \n\nDescrição: Ele armazena uma quantidade abundante de energia elétrica dentro de seu corpo. Mesmo um pequeno choque pode fazê-lo " +
                        "\nexplodir. É temido, com o apelido de \"A Bola Bomba\". São muito usados como geradores de energia em usinas de força. " +
                        "\nConsome eletricidade da atmosfera. Em dias de queda de raios, você pode vê-lo explodindo por toda parte por comer muita eletricidade.",

                "Tipo: Planta/Psíquico \n\nDescrição: Este pokémon é formado por seis ovos comunicam-se entre si por telepatia. Quando aparecem cada vez mais " +
                        "\nrachaduras nos ovos, é sinal que Exeggcute está para evoluir. No minuto em que um membro do grupo desaparece, Exeggcute torna-se covarde. " +
                        "\nDeve haver seis cabeças para manter o equilíbrio. Mesmo que pareça ser algum tipo de ovo, descobriu-se que era uma forma de vida mais parecida com sementes de plantas.",

                "Tipo: Planta/Psíquico \n\nDescrição: Exeggutor veio originalmente dos trópicos. Apesar de cada uma de suas 3 cabeças pensar por si, nunca vão brigar. " +
                        "\nEles usam a telepatia para discutir seus planos antes de chegar a uma decisão conjunta. Quando trabalham juntos, podem liberar uma poderosa " +
                        "\nenergia psíquica. Os dias nublados tornam este pokémon lento. Se uma de suas cabeças crescer muito, ela cai e se torna um Exeggcute.",

                "Tipo: Terrestre \n\nDescrição: Sua cabeça é coberta pelo crânio de sua falecida mãe. Ninguém sabe como é o seu rosto. Ele chora sempre que se lembra " +
                        "\nse sua mãe. As marcas desse crânio foram causadas pelas lágrimas de Cubone que escorreram. De acordo com alguns, seu choro o deixa mais forte " +
                        "\naté que supere a morte da mãe. Seu choro, por azar, pode acabar atraindo Mandibuzz, seu predador.",

                "Tipo: Terrestre \n\nDescrição: Este pokémon superou sua tristeza ao evoluir para um novo corpo robusto. O crânio de sua mãe se fundiu a ele. " +
                        "\nGuarda ossos desde que nasceu. Possui uma grande habilidade para usá-los como armas. Manda mensagens para outros de sua espécie dando marretadas " +
                        "\nem pedras com o osso que carrega. Tem um temperamento violeto. Ele atira ossos em Mandibuzz para derrubá-lo.",

                "Tipo: Lutador \n\nDescrição: Suas pernas podem se esticar para o dobro do tamanho. Quando está com pressa, pode correr dando passos bem largos. " +
                        "\nConsegue dar vários chutes consecutivos sem sair do lugar. Pode aprender qualquer tipo de chute. Tem um incrível senso de equilíbrio, " +
                        "\npodendo chutar sucessivamente de qualquer posição. Após a batalha, ele esfrega as pernas e relaxa os músculos para superar a fadiga.",

                "Tipo: Lutador \n\nDescrição: Seus socos são tão velozes que rasgam o ar. Eles são lançados em alta velocidade, mesmo um leve arranhão pode causar " +
                        "\nqueimaduras. Os socos que ele lança pulverizam até mesmo o concreto. Possui um espírito indomável de nunca desistir perante as adversidades. " +
                        "\nPrecisa de um tempo para descansar a cada 3 minutos de batalha. Dizem que possui o espírito de um boxeador que estava treinando para um campeonato mundial.",

                "Tipo: Normal \n\nDescrição: Sua língua tem mais de dois metros de comprimento. Quem for lambido será paralisado. Quando ele a estica por completo, " +
                        "\nsua cauda balança. Acredita-se que língua e cauda estão de alguma forma conectados. Se a saliva pegajosa desse pokémon encostar em você " +
                        "\ne você não a limpar, uma coceira intensa irá se manifestar. Sua principal fonte de alimento são os pokémons insetos.",

                "Tipo: Veneno \n\nDescrição: Este pokémon consegue soltar gases explosivos. O seu gás venenoso é mais leve que o ar, o que mantém ele flutuando. " +
                        "\nSeu gás é ainda mais tóxico em ambientes quentes ou quando fica irritado. Ele flutua em depósitos de lixo, procurando a fumaça do " +
                        "\nlixo cru e apodrecido. Se ele inflar demais o corpo, pode explodir. Ele fede quando está próximo.",

                "Tipo: Veneno \n\nDescrição: Onde dois tipos de gases venenosos se encontram, dois Koffings podem se fundir em um Weezing durante muitos anos. " +
                        "\nQuando uma cabeça infla, a outra murcha. Embora muito raros, trigêmeos foram encontrados. Ele mistura substâncias tóxicas em seu corpo. " +
                        "\nWeezing adora os gases emitidos pelo lixo podre da cozinha. Este pokémon encontrará uma casa suja e mal cuidada e fará dela seu lar.",

                "Tipo: Terrestre/Pedra \n\nDescrição: Ele é lento e tem dificuldade para virar o corpo para o lado devido às suas patas curtas. Seus ossos " +
                        "\nsão mil vezes mais duros do que os dos homens. Não é muito cauteloso, podendo destruir o que estiver em seu caminho. Pode quebrar " +
                        "\naté mesmo um arranha-céu com suas investidas. Não muito inteligente, assim que começa a correr, ele esquece por que começou. Ele pode se lembrar apenas de uma coisa de cada vez",

                "Tipo: Terrestre/Pedra \n\nDescrição: Seu cérebro se desenvolveu depois que passou a andar sobre duas patas. A pele grossa que possui pode " +
                        "\nprotegê-lo ainda que esteja sob o magma de 2.000° C. Seu chifre pode girar como uma broca, sendo capaz de quebrar até mesmo diamantes. " +
                        "\nUm golpe violento de sua cauda pode derrubar um edifício. Sua pele é tão resistente que mesmo golpes diretos de um canhão não deixam um arranhão.",

                "Tipo: Normal \n\nDescrição: Sendo raros e de difícil captura, é dito que ela traz felicidade para o treinador que a pega. Seus ovos são nutritivos " +
                        "\ne recomendados para uma alimentação balanceada. É usado como ingrediente culinário de alta classe. Anda com cautela para evitar ter seu " +
                        "\novo quebrado. Mesmo assim, aprendeu a fugir rapidamente, tendo em vista que muitos humanos e pokémons querem pegar os seus ovos. " +
                        "\nPor ser compassiva, compartilha seus ovos com os feridos.",

                "Tipo: Planta \n\nDescrição: Seu corpo é coberto por um emaranhado de vinhas. Elas são compostas por finos fios de cabelo. Sua tática é enrolar " +
                        "\nos adversários com suas vinhas. A verdadeira aparência deste pokémon permanece um mistério. Suas vinhas possuem um perfume distinto. " +
                        "\nEm algumas lugares, elas são usadas como ervas. As vinhas se quebram facilmente se forem agarradas. As vinhas perdidas são substituídas " +
                        "\npor vinhas recém-crescidas no dia seguinte.",

                "Tipo: Normal \n\nDescrição: Este pokémon guarda seus filhotes em sua bolsa marsupial. Ela fará de tudo para proteger o bebê, ainda que judiada em " +
                        "\nbatalha. Seu amor maternal é tão profundo que enfrentará a morte para proteger sua cria. Raramente o bebê sai da bolsa, eles permanecem " +
                        "\nlá até completarem 3 anos de idade. Não perdoa quem machucar seu filhote. Existem registros de uma criança humana perdida sendo criada por uma Kangaskhan sem filhos.",

                "Tipo: Água \n\nDescrição: Ele faz o seu ninho entre corais. Quando está assustado, esguicha um jato de tinta. Se cai em uma correnteza, enrola " +
                        "\nsua cauda numa pedra ou planta para não ser levado. Consegue nadar de costas com a sua nadadeira dorsal. Eles nadam com movimentos de " +
                        "\ndança e causam a formação de redemoinhos. Competem entre si para ver quem gera o maior redemoinho. Se alimenta de pequenos insetos e musgo das rochas.",

                "Tipo: Água \n\nDescrição: A barriga dele possui grossas cerdas que são venenosas. Os espinhos em suas costas secretam veneno. Seus redemoinhos " +
                        "\nsão fortes o suficiente para engolir barcos de pesca. Geralmente são os machos que cuidam dos filhotes. Ossos e nadadeiras deste pokémon " +
                        "\nsão ingredientes de uma medicina caseira. Sua boca é fina, mas seu poder de sucção é forte, podendo sugar alimentos maiores do que a boca. " +
                        "\nDorme depois de se contorcer entre os galhos de coral.",

                "Tipo: Água \n\nDescrição: Em época de desova, eles são vistos nadando em rios e cachoeiras em grandes grupos. São ótimos e belos nadadores. " +
                        "\nSe colocados em um grande aquário de vidros resistentes, irão quebrá-lo com a força de seu chifre para escapar. Quando o clima fica quente, " +
                        "\neles formam grupos e nadam rio acima. Competem entre si para ver quem tem o chifre mais grosso e afiado. Suas nadadeiras ondulam elegantemente na água.",

                "Tipo: Água \n\nDescrição: Com o seu poderoso chifre, faz buracos nas pedras dos leitos dos rios para fazer o ninho de seus ovos. Ele dá a " +
                        "\nprópria vida para defender seus ovos. No outono, seu corpo fica mais gordo ao se preparar para pedir um par. Ele assume belas cores. " +
                        "\nA coloração do macho é mais viva. Para atrair as fêmeas, os machos dançam no fundo do rio. As fêmeas se reúnem em torno do macho que dança com mais elegância.",

                "Tipo: Água \n\nDescrição: Mesmo que seus membros sejam cortados, Staryu conseguirá regenerá-los desde que a jóia no centro de seu corpo não tenha " +
                        "\nsido danificada. Quando está muito fraco, a jóia de Staryu começa a piscar. Se você visitar uma praia no final do verão, poderá ver grupos " +
                        "\nde Staryu piscando em um ritmo constante. Em muitos lugares, existem contos populares de poeira estelar caindo no oceano e se tornando Staryu.",

                "Tipo: Água/Psíquico \n\nDescrição: Seu corpo se desenvolve num formato geometricamente simétrico. Ela se movimenta nas águas girando o corpo como " +
                        "\numa hélice. A jóia no núcleo de seu corpo brilha nas sete cores do arco-íris. Pensa-se que seu núcleo brilhante recebe e transmite sinais enigmáticos. " +
                        "\nSabe-se que causa dores de cabeça em quem se aproxima. Seu núcleo cintilante é chamado de “a joia do mar”. Existe um mercado de tráfico dessas joias.",

                "Tipo: Psíquico/Fada \n\nDescrição: Ele cria paredes invisíveis vibrando os seus dedos minuciosamente para parar as moléculas no ar. Seus gestos de " +
                        "\nmímico acabam enganando os outros que pensam que não há nada no caminho. A largura de suas mãos pode não ser coincidência, muitos " +
                        "\ncientistas acreditam que suas palmas aumentaram especificamente para os seus números de pantomima.",

                "Tipo: Inseto/Voador \n\nDescrição: As foices afiadas em seus braços ficam ainda mais afiadas quando cortam objetos duros. Ele é tão rápido e " +
                        "\nveloz quanto um ninja. Ele se esconde pelo gramado pois a cor de seu corpo ajuda a camuflá-lo. Se você encontrar uma área em uma " +
                        "\nfloresta onde muitas árvores foram cortadas, trata-se de um território de Scyther. Com um único corte, Scyther pode derrubar " +
                        "\numa árvore enorme. Vivem em bandos treinando nas montanhas.",

                "Tipo: Gelo/Psíquico \n\nDescrição: Ela fala uma linguagem semelhante à dos seres humanos. No entanto, ela parece usar a dança para se comunicar. " +
                        "\nEla rebola os quadris enquanto anda. Existem alguns músicos que compõem canções para Jynx cantar. Costuma ter vozes bonitas e delicadas. " +
                        "\nAlguns Jynx até reuniram uma base de fãs. Já foi temida e adorada como a Rainha do Gelo.",

                "Tipo: Elétrico \n\nDescrição: O corpo dele descarrega energia constante mente. Ao chegar perto dele, os cabelos de uma pessoa irão se arrepiar. " +
                        "\nElectabuzz gosta de se alimentar da energia de usinas de força, causando grandes apagões nas cidades. Com a chegada de uma tempestade, " +
                        "\nmuitos deles se reunirão sob as árvores altas e ficarão sentados esperando que um raio caia. Ele balança os braços e gira para " +
                        "\ncarregar eletricidade antes de desferir um soco.",

                "Tipo: Fogo \n\nDescrição: Magmar não gosta de lugares frios, por isso, sopra um fogo abrasador para tornar o ambiente adequado para si. " +
                        "\nQuando respira profundamente, emana ondas de calor de seu corpo. Vive próximo às bocas de vulcões, seu corpo resiste a lava. " +
                        "\nEle embebe seu corpo em magma para aliviar seu cansaço. Seu corpo queima a 1.200° C. Ele despacha sua presa com fogo, " +
                        "\nmas logo se arrepende quando percebe que torrou o que ia comer.",

                "Tipo: Inseto \n\nDescrição: Pinsir possui grandes chifres com espinhos. Com eles, agarra seus adversários como uma pinça e aperta-os. " +
                        "\nÉ forte o bastante para partir uma árvore. Também utiliza os chifres para cavar buracos onde dorme à noite. Julgam uns aos outros " +
                        "\ncom base em suas pinças. Pinças mais grossas e impressionantes tornam-se mais populares com o sexo oposto. Embora seja resistente, " +
                        "\nnão suporta bem o frio. Vive em lugares quentes.",

                "Tipo: Normal \n\nDescrição: É um pokémon de natureza violenta. Ele chicoteia a si mesmo usando seus três rabos para incentivá-lo a batalhar. " +
                        "\nQuando corre junto com a manada, não para até colidir com algo. Aquele com os chifres mais longos, grossos e marcados é o chefe do rebanho. " +
                        "\nSe não houver oponente para Tauros lutar, ele irá atacar árvores grossas e derrubá-las para se acalmar.",

                "Tipo: Água \n\nDescrição: Dizem que este é um dos pokémons mais fracos que existem. Seu golpe de respingar água é simplesmente inútil. " +
                        "\nTem dificuldade mesmo para nadarm, sendo facilmente levado pela correnteza. Em raras ocasiões, consegue dar grandes saltos. " +
                        "\nEmbora fraco e indefeso, é incrivelmente fértil. Existem em tantas multidões que você logo se cansará de vê-los. " +
                        "\nGraças ao seu forte controle da vida, a água suja não os incomoda em nada.",

                "Tipo: Água/Voador \n\nDescrição: A energia da evolução estimulou fortemente suas células cerebrais, tornando-as muito ferozes. Uma vez que " +
                        "\nfique irado, não irá se acalmar até ter destruído tudo que estiver pelo seu caminho. Ele tem um instinto agressivo. " +
                        "\nÉ conhecido por ter incendiado cidades com seus raios. Existem algumas regiões onde é chamado de \"A Divindade da Destruição\".",

                "Tipo: Água/Gelo \n\nDescrição: Adora atravessar os mares carregando pessoas e pokémons em suas costas. Lapras é capaz de entender a fala humana." +
                        "\n Ele é gentil e tem o hábito de cantar graciosamente quando está de bom humor. Sua pele lisa é um pouco fria ao toque. Lapras já " +
                        "\nestiveram perto da extinção devido à caça ilegal. Seguindo os regulamentos de proteção, agora há uma superabundância deles. Possuem coração gentil e raramente lutam.",

                "Tipo: Normal \n\nDescrição: Tem a capacidade de reconstituir sua estrutura celular para se transformar em qualquer coisa que esteja vendo. " +
                        "\nSe tentar se transformar em algo baseando-se no que tem na memória, acaba errando vários detalhes. Com sua surpreendente capacidade de metamorfose, " +
                        "\npode conviver com qualquer coisa. Quando encontrar outro Ditto, ele se moverá mais rápido do que o normal para duplicar exatamente esse oponente.",

                "Tipo: Normal \n\nDescrição: Por possuir uma composição genética irregular, Eevee pode evoluir seu corpo para as mais diversificadas formas, dependendo " +
                        "\ndaquilo que o cerca. Por esta razão, consegue adaptar-se facilmente a qualquer tipo de ambiente. Até seu rosto começa a se parecer com o " +
                        "\nde seu treinador. A questão de por que apenas Eevee tem genes tão instáveis ainda não foi resolvida.",

                "Tipo: Água \n\nDescrição: Sua composição celular é semelhante às moléculas de água. Quando suas barbatanas começam a vibrar, é sinal que uma chuva está " +
                        "\npara cair. Ele pode fundir o seu corpo na água, ficando completamente invisível. Misturando-se com a água e apagando todos os sinais de sua presença, " +
                        "\nele espera pacientemente por sua presa, os pokémons peixes. Quando está prestes a ser atacado por um inimigo invasor, ele mergulha na água para se esconder.",

                "Tipo: Elétrico \n\nDescrição: Ele pode descarregar uma força de dez mil volts. Para tanto, acumula íons negativos na atmosfera. Os pelos de " +
                        "\nseu corpo são tão espetados quanto uma agulha afiada. Ele arruma sua pelugem com eletricidade. Quando seu pelo fica de pé, " +
                        "\né um sinal de que está prestes a soltar uma descarga elétrica. Tome cuidado, pois às vezes um raio cai próximo a " +
                        "\nele também. Seus pulmões contêm um órgão que cria eletricidade.",

                "Tipo: Fogo \n\nDescrição: As chamas que ele dispara são tão quentes que podem chegar a mais de 1700ºC. Sua temperatura corporal ultrapassa os 800ºC. " +
                        "\nEle armazena parte do ar que inala em sua bolsa de chama interna. Quando inspira profundamente, dispara as chamas. Ele afofa sua pelugem com " +
                        "\na temperatura do corpo. Quando pega uma presa ou encontra frutas, ele sopra fogo sobre elas até que estejam bem passadas e então as engole.",

                "Tipo: Normal \n\nDescrição: Este pokémon artificial foi criado por tecnologias científicas avançadas. No entanto, esta era uma ciência de ponta de " +
                        "\n20 anos atrás, então muitas partes dele se tornaram obsoletas. Ele pode converter seu corpo em dados digitais, o que permite mover-se " +
                        "\nlivremente no ciberespaço, sendo uma boa ferramenta para investigar dados suspeitos. Está programado apenas com emoções básicas " +
                        "\ne não precisa respirar para sobreviver.",

                "Tipo: Pedra/Água \n\nDescrição: Este pokémon nadava pelos mares torcendo os seus 10 tentáculos desde os tempos antigos. Ele usa o ar armazenado " +
                        "\nem sua concha para emergir e submergir na água. Se atacado por um inimigo, ele se retira para dentro de sua concha dura. Eles são " +
                        "\nrevividos de fósseis por cientistas. Seus fósseis já foram encontrados com mordidas de Archeops, seu predador. Como alguns " +
                        "\nOmanytes conseguem escapar após serem restaurados ou são soltos na natureza pelas pessoas, essa espécie está se tornando um problema.",

                "Tipo: Pedra/Água \n\nDescrição: Acredita-se que este pokémon tenha se extinguido por sua concha espiral ter crescido muito e ficado pesado demais " +
                        "\npara suportar. Omastar não conseguia se mover muito rápido. Ele agarra suas vítimas com seus tentáculos e as tritura com seus dentes afiados. " +
                        "\nSeus dentes podem esmagar pedras, mas só consegue atacar a presa que estiver ao alcance de seus tentáculos. Aparentemente, é um ancestral distante de Octillery.",

                "Tipo: Pedra/Água \n\nDescrição: Acredita-se que ele tenha habitado praias 300 milhões de anos atrás. Seu corpo é protegido por um duro casco. " +
                        "\nEle também possui olhos nesse casco. Ele faz uma muda a cada 3 dias, tornando seus cascos cada vez mais duros. Já foram encontrados " +
                        "\nalguns exemplares de seu fóssil ainda vivos em alguns lugares. Eles permanecerem escondidos no fundo do oceano todo esse tempo.",

                "Tipo: Pedra/Água \n\nDescrição: Kabutops eram agressivos que habitavam mares quentes. Estudos dizem que esse pokémon deixou os mares porque suas " +
                        "\npresas adaptaram-se a viver em terra firme. Ele ataca suas presas cortando-as com as lâminas de suas garras afiadas. Ele suga os fluidos " +
                        "\nda presa e descarta o resto, que era consumido por outros pokémons. Na água, ele encolhe os membros para se tornar mais compacto, depois " +
                        "\nbalança o casco para nadar rápido.",

                "Tipo: Pedra/Voador \n\nDescrição: O extinto pokémon percorria os céus na era dos dinossauros. Era feroz. Seus dentes se movem como uma serra ao mastigar. " +
                        "\nConseguem rasgar até mesmo a pele de um pokémon tipo aço. Cientistas conseguem ressuscitá-lo a partir de um material genético de dinossauro " +
                        "\nextraído de um velho âmbar. Uma teoria amplamente aceita é que ele foi extinto devido ao impacto de um grande meteoro. Mesmo a tecnologia moderna " +
                        "\né incapaz de produzir um espécime perfeitamente restaurado.",

                "Tipo: Normal \n\nDescrição: Se torna muito preguiçoso quando está de estômago cheio. Sua barriga se torna elástica, fazendo pular qualquer coisa que " +
                        "\ncair sobre ela. Ele não fica satisfeito a menos que coma mais de 400 kg de comida todos os dias. Seu estômago pode digerir qualquer tipo de veneno. " +
                        "\nUma comida mofada ou estragada não o afetará. Dorme por um longo período após comer bastante. Quando se propõe a fazer um esforço, ele exibe um poder incrível.",

                "Tipo: Gelo/Voador \n\nDescrição: Pode criar nevascas congelando a umidade do ar. Dizem que suas asas são feitas de gelo. O bater de suas asas esfria o ar. " +
                        "\nComo resultado, dizem que quando esse pokémon voa, começa a nevar. Com uma cauda longa e brilhante, sua forma de voar é magnífica. Ele aparece para " +
                        "\npessoas perdidas em montanhas congeladas.",

                "Tipo: Elétrico/Voador \n\nDescrição: É dito que este pokémon vive em nuvens de trovão. Nuvens negras de tempestade é o local perfeito para o seu ninho. " +
                        "\nEle consegue controlar livremente os relâmpagos e a eletricidade. Dizem que quando Zapdos esfrega suas penas, um raio cai imediatamente " +
                        "\ndepois. Ganha forças quando é atingido por um raio. Costuma soltar alguns estrondos enquanto voa.",

                "Tipo: Fogo/Voador \n\nDescrição: A aparição de Moltres indica a chegada da primavera. Quando bate suas asas flamejantes, elas brilham com um vermelho " +
                        "\nestonteante. Usa suas asas radiantes envoltas em chamas para iluminar caminhos para aqueles que se perderam nas montanhas. Quando ele é ferido, " +
                        "\nmergulha seu corpo no magma de um vulcão para queimar e curar o seu corpo. Atletas carregam uma tocha com sua chama em algumas Ligas Pokémon.",

                "Tipo: Dragão \n\nDescrição: É conhecido como \"pokémon miragem\" pois poucos já o viram. Depois de uma luta de 10 horas, um pescador conseguiu fisgar " +
                        "\num e confirmar sua existência. Ele troca de pele continuamente e fica cada vez maior. Ele faz isso porque sua energia vital aumenta constantemente, " +
                        "\natingindo níveis incontroláveis. Dratini mora perto de corpos de água que fluem rapidamente. O pequeno caroço em sua testa é na verdade um chifre que ainda está aparecendo.",

                "Tipo: Dragão \n\nDescrição: Se o seu corpo adquire uma aura, o tempo muda instantaneamente. As jóias cristalinas que possui dão a ele o poder de controlar o " +
                        "\nclima. Por isso, é venerado pela população agrícola. Diz-se que vive em mares e lagos, mas também é visto voando. Quando envolvido por uma aura, " +
                        "\nDragonair tem uma aparência mística. Alguns dizem que se você o vir no início do ano, voando pelo céu e retorcendo o corpo, terá saúde o ano todo.",

                "Tipo: Dragão/Voador \n\nDescrição: É conhecido como \"A Encarnação do Mar\". Ele constrói sua casa em algum lugar do oceano. O formato de seu corpo permite " +
                        "\nque consiga voar tranquilamente sobre mares agitados. É um pokémon de bom coração. Se avistar alguém se afogando, irá ajudar. Ele ajuda os navios " +
                        "\na encontrar terra firme em tempestades. Dizem que existe uma ilha remota, um paraíso ocupado exclusivamente por Dragonite. " +
                        "\nEle é capaz de dar a volta ao mundo em 16 horas.",

                "Tipo: Psíquico \n\nDescrição: Um pokémon que foi clonado geneticamente de Mew. Foi criado por um cientista após experimentos de processamento de genes " +
                        "\ne engenharia de DNA. O poder científico dos humanos não conseguiu dar a ele um coração compassivo. Seu coração é selvagem e seu " +
                        "\npoder é avassalador. Geralmente ele permanece imóvel para conservar sua energia, de forma que possa liberar seu poder total em batalha.",

                "Tipo: Psíquico \n\nDescrição: Se mostra apenas para pessoas de coração puro. Seu DNA contém códigos genéticos de todos os pokémons. " +
                        "\nComo é capaz de aprender qualquer tipo de golpe, muitos cientistas acreditam que ele é o antepassado de todos os pokémons. " +
                        "\nMuitos acreditam estar extinto, mas avistamentos dele ainda estão sendo relatados até hoje. Ele é capaz de se tornar invisível " +
                        "\nà vontade, então evita ser notado quando as pessoas se aproximam."};

        menu(pokemons, descricao);

    }
}

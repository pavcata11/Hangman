import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        String ANSI_BLUE = "\u001B[34m";
        System.out.println(ANSI_BLUE + "                                                                 Добре дошли в моята игра - Бесеница              ");
        title();
        System.out.print("Думата която трябва да познаете е:  ");
        printHangmanAndUsedLetters(randomWordIs());
    }

    //////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////

    public static void title() {
        String ANSI_RED = "\u001B[31m";
        System.out.println(ANSI_RED + "\n" +
                "                         _   _                                               | Бесеница е името на популярна в цял свят игра                                    |  \n" +
                "                        | | | |                                              | за познаване на думи. Целта ви е да огтатнете                                    |    \n" +
                "                        | |_| | __ _ _ __   __ _ _ __ ___   __ _ _ __        | скритата дума,чиито букви са отбелязани с чертички.                              |  \n" +
                "                        |  _  |/ _  | '_ \\ / _  |  _   _ \\ / _  |  _ \\       | За целта въведете избраната от вас буква от азбуката                             |  \n" +
                "                        | | | | (_| | | | | (_| | | | | | | (_| | | | |      | Ако буквата я има в намислената дума, тя ще се покаже на                         |  \n" +
                "                        \\_| |_/\\__,_|_| |_|\\__, |_| |_| |_|\\__,_|_| |_|      | съответното място (или места ако се среща повече от веднъж).                     |  \n" +
                "                                            _/  |                            | В противен случай, се рисува част от бесилото или човечето. Когато               |    \n" +
                "                                           |___/                             | то се нарисува изцяло, след 8 грешки, играта приключва - човечето е обесено. На  |          \n" + "" +
                "                                                                             | този етап играта има 1 речник - (Състои се от населените места в България).Успех!|        \n" + "" +
                "                                                                              ----------------------------------------------------------------------------------");
        System.out.println();
    }

    //////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////

    public static void mistake_1() {
        System.out.println("                                                                               _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _                                          ");
        System.out.println("                                                                              |      ++- - - - - + - - -      |                          ");
        System.out.println("                                                                              |      || //                    |                         ");
        System.out.println("                                                                              |      +|//                     |                     ");
        System.out.println("                                                                              |      +|/                      |               ");
        System.out.println("                                                                              |      +|                       |             ");
        System.out.println("                                                                              |      ||                       |                  ");
        System.out.println("                                                                              |      ||                       |                               ");
        System.out.println("                                                                              |      ||                       |                ");
        System.out.println("                                                                              |      ||                       |                     ");
        System.out.println("                                                                              |      ||                       |                      ");
        System.out.println("                                                                              |      ||                       |                          ");
        System.out.println("                                                                              |      ++++                     |                       ");
        System.out.println("                                                                              |      ++++++++++++             |                                     ");
        System.out.println("                                                                               - - - - - - - - - - - - - - - - ");
    }

    public static void mistake_2() {
        System.out.println("                                                                               _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _                                          ");
        System.out.println("                                                                              |      ++- - - - - + - - -      |                          ");
        System.out.println("                                                                              |      || //       |            |                         ");
        System.out.println("                                                                              |      +|//       _|_           |                     ");
        System.out.println("                                                                              |      +|/                      |               ");
        System.out.println("                                                                              |      +|                       |             ");
        System.out.println("                                                                              |      ||                       |                  ");
        System.out.println("                                                                              |      ||                       |                               ");
        System.out.println("                                                                              |      ||                       |                ");
        System.out.println("                                                                              |      ||                       |                     ");
        System.out.println("                                                                              |      ||                       |                      ");
        System.out.println("                                                                              |      ||                       |                          ");
        System.out.println("                                                                              |      ++++                     |                       ");
        System.out.println("                                                                              |      ++++++++++++             |                                     ");
        System.out.println("                                                                               - - - - - - - - - - - - - - - - ");
    }

    public static void mistake_3() {
        System.out.println("                                                                               _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _                                          ");
        System.out.println("                                                                              |      ++- - - - - + - - -      |                          ");
        System.out.println("                                                                              |      || //       |            |                         ");
        System.out.println("                                                                              |      +|//       _|_           |                     ");
        System.out.println("                                                                              |      +|/       /o o\\          |               ");
        System.out.println("                                                                              |      +|       (| ( |)         |             ");
        System.out.println("                                                                              |      ||        \\_-_/          |                  ");
        System.out.println("                                                                              |      ||                       |                               ");
        System.out.println("                                                                              |      ||                       |                ");
        System.out.println("                                                                              |      ||                       |                     ");
        System.out.println("                                                                              |      ||                       |                      ");
        System.out.println("                                                                              |      ||                       |                          ");
        System.out.println("                                                                              |      ++++                     |                       ");
        System.out.println("                                                                              |      ++++++++++++             |                                     ");
        System.out.println("                                                                               - - - - - - - - - - - - - - - - ");
    }

    public static void mistake_4() {
        System.out.println("                                                                               _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _                                          ");
        System.out.println("                                                                              |      ++- - - - - + - - -      |                          ");
        System.out.println("                                                                              |      || //       |            |                         ");
        System.out.println("                                                                              |      +|//       _|_           |                     ");
        System.out.println("                                                                              |      +|/       /o o\\          |               ");
        System.out.println("                                                                              |      +|       (| ( |)         |             ");
        System.out.println("                                                                              |      ||        \\_-_/          |                  ");
        System.out.println("                                                                              |      ||        _ | _          |                               ");
        System.out.println("                                                                              |      ||        | : |          |                ");
        System.out.println("                                                                              |      ||        | : |          |                     ");
        System.out.println("                                                                              |      ||        | _ |          |                      ");
        System.out.println("                                                                              |      ||                       |                          ");
        System.out.println("                                                                              |      ++++                     |                       ");
        System.out.println("                                                                              |      ++++++++++++             |                                     ");
        System.out.println("                                                                               - - - - - - - - - - - - - - - - ");
    }

    public static void mistake_5() {
        System.out.println("                                                                               _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _                                          ");
        System.out.println("                                                                              |      ++- - - - - + - - -      |                          ");
        System.out.println("                                                                              |      || //       |            |                         ");
        System.out.println("                                                                              |      +|//       _|_           |                     ");
        System.out.println("                                                                              |      +|/       /o o\\          |               ");
        System.out.println("                                                                              |      +|       (| ( |)         |             ");
        System.out.println("                                                                              |      ||        \\_-_/          |                  ");
        System.out.println("                                                                              |      ||        _ | _          |                               ");
        System.out.println("                                                                              |      ||   )---0| : |          |                ");
        System.out.println("                                                                              |      ||        | : |          |                     ");
        System.out.println("                                                                              |      ||        | _ |          |                      ");
        System.out.println("                                                                              |      ||                       |                          ");
        System.out.println("                                                                              |      ++++                     |                       ");
        System.out.println("                                                                              |      ++++++++++++             |                                     ");
        System.out.println("                                                                               - - - - - - - - - - - - - - - - ");
    }

    public static void mistake_6() {
        System.out.println("                                                                               _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _                                          ");
        System.out.println("                                                                              |      ++- - - - - + - - -      |                          ");
        System.out.println("                                                                              |      || //       |            |                         ");
        System.out.println("                                                                              |      +|//       _|_           |                     ");
        System.out.println("                                                                              |      +|/       /o o\\          |               ");
        System.out.println("                                                                              |      +|       (| ( |)         |             ");
        System.out.println("                                                                              |      ||        \\_-_/          |                  ");
        System.out.println("                                                                              |      ||        _ | _          |                               ");
        System.out.println("                                                                              |      ||   )---0| : |---(      |                ");
        System.out.println("                                                                              |      ||        | : |          |                     ");
        System.out.println("                                                                              |      ||        | _ |          |                      ");
        System.out.println("                                                                              |      ||                       |                          ");
        System.out.println("                                                                              |      ++++                     |                       ");
        System.out.println("                                                                              |      ++++++++++++             |                                     ");
        System.out.println("                                                                               - - - - - - - - - - - - - - - - ");
    }

    public static void mistake_7() {
        System.out.println("                                                                               _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _                                          ");
        System.out.println("                                                                              |      ++- - - - - + - - -      |                          ");
        System.out.println("                                                                              |      || //       |            |                         ");
        System.out.println("                                                                              |      +|//       _|_           |                     ");
        System.out.println("                                                                              |      +|/       /o o\\          |               ");
        System.out.println("                                                                              |      +|       (| ( |)         |             ");
        System.out.println("                                                                              |      ||        \\_-_/          |                  ");
        System.out.println("                                                                              |      ||        _ | _          |                               ");
        System.out.println("                                                                              |      ||   )---0| : |---(      |                ");
        System.out.println("                                                                              |      ||        | : |          |                     ");
        System.out.println("                                                                              |      ||        | _ |          |                      ");
        System.out.println("                                                                              |      ||        ||             |");
        System.out.println("                                                                              |      ||       _||             |                          ");
        System.out.println("                                                                              |      ++++    \\__/             |                       ");
        System.out.println("                                                                              |      ++++++++++++             |                                     ");
        System.out.println("                                                                               - - - - - - - - - - - - - - - - ");
    }

    public static void mistake_8() {
        System.out.println("                                                                               _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _                                          ");
        System.out.println("                                                                              |      ++- - - - - + - - -      |                          ");
        System.out.println("                                                                              |      || //       |            |                         ");
        System.out.println("                                                                              |      +|//       _|_           |                     ");
        System.out.println("                                                                              |      +|/       /o o\\          |               ");
        System.out.println("                                                                              |      +|       (| ( |)         |             ");
        System.out.println("                                                                              |      ||        \\_-_/          |                  ");
        System.out.println("                                                                              |      ||        _ | _          |                               ");
        System.out.println("                                                                              |      ||   )---0| : |---(      |                ");
        System.out.println("                                                                              |      ||        | : |          |                     ");
        System.out.println("                                                                              |      ||        | _ |          |                      ");
        System.out.println("                                                                              |      ||        || ||          |");
        System.out.println("                                                                              |      ||       _|| ||_         |                          ");
        System.out.println("                                                                              |      ++++    \\__/ \\__/        |                       ");
        System.out.println("                                                                              |      ++++++++++++             |                                     ");
        System.out.println("                                                                               - - - - - - - - - - - - - - - - ");
    }

    public static String[] wordlist() {
        String[] wordlist = {"софия", "пловдив", "варна", "бургас", "русе", "плевен", "добрич", "сливен", "шумен", "перник", "пазарджик",
                "ямбол", "хасково", "благоевград", "враца", "габрово", "асеновград", "видин", "казанлък", "кърджали", "кюстендил",
                "монтана", "търговище", "димитровград", "силистра", "ловеч", "дупница", "разград", "свищов", "петрич", "смолян"
                , "сандански", "самоков", "велинград", "севлиево", "лом", "карлово", "айтос", "троян", "ботевград", "харманли"
                , "пещера", "свиленград", "карнобат", "панагюрище", "чирпан", "попово", "раковски", "ракитово", "гълъбово"
                , "радомир", "първомай", "поморие", "несебър", "козлодуй", "ихтиман", "берковица", "раднево", "провадия", "разлог"
                , "балчик", "каварна", "костинброд", "банкя", "стамболийски", "етрополе", "кнежа", "левски", "павликени", "мездра",
                "елхово", "тетевен", "луковит", "тутракан", "трявна", "девня", "средец", "омуртаг", "сопот", "исперих", "бяла",
                "кричим", "лясковец", "септември", "момчилград", "банско", "белене", "аксаково", "белослав", "своге", "дряново"
                , "любимец", "кубрат", "пирдоп", "симитли", "сливница", "златоград", "хисаря", "дулово", "симеоновград", "тервел",
                "костенец", "девин", "мадан", "стралджа", "царево", "вършец", "твърдица", "куклен", "котел"
                , "съединение", "елена", "оряхово", "якоруда", "божурище", "тополовград", "белоградчик", "стражица", "камено",
                "чепеларе", "созопол", "перущица", "суворово", "златица", "крумовград", "дългопол", "ветово", "тръстеник", "койнаре",
                "славяново", "годеч", "правец", "игнатиево", "костандово", "брацигово", "стрелча", "неделино", "брезник", "смядово",
                "мартен", "ивайловград", "кресна", "върбица", "рудозем", "вълчедръм", "приморско", "глоджево", "летница",
                "мъглиж", "искър", "шабла", "гулянци", "крън", "баня", "драгоман", "сунгурларе", "шивачево", "белово"
                , "батак", "джебел", "завет", "криводол", "мизия", "белица", "каспичан", "кула", "николаево", "ветрен"
                , "гурково", "роман", "калофер", "каблешково", "априлци", "бухово", "ябланица", "рила", "опака", "угърчин", "златарица"
                , "хаджидимово", "добринище", "обзор", "дунавци", "брегово", "трън", "садово", "килифарево", "лъки", "доспат", "копривщица"
                , "кочериново", "ардино", "дебелец", "никопол", "цалапица", "рудник", "костенец"
                , "лозница", "борово", "черноморец", "батановци", "пордим", "ахелой", "сухиндол", "българово", "брезово", "главиница"
                , "каолиново", "чипровци", "меричлери", "земен", "плачковци", "кермен", "алфатар", "грамада", "сеново", "бойчиновци",
                "антоново", "ахтопол", "бобошево", "шипка", "болярово", "димово", "брусарци", "китен", "клисура", "плиска", "маджарово",
                "мелник", "айдемир", "градец", "мало конаре", "буковлък", "волуяк", "тодор икономово"
                , "селановци", "владая", "трудовец", "алеко константиново", "рогош", "гложене"
                , "каменар", "брестовене", "маноле", "йоаким груевоa", "дорково", "сотиря", "браниполе", "ковачево",
                "кочан", "панчарево", "старо оряхово", "копринка", "равда", "болярци", "смирненски", "абланица", "галата",
                "куртово конаре", "черник", "огняново", "ново село", "търнава"};

        return wordlist;
    }
    //////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////

    public static char[] randomWordIs() {
        String[] wordlist = wordlist();
        Random random = new Random();
        char[] randomWordIs = wordlist[random.nextInt(wordlist.length)].toCharArray();
        //System.out.println(randomWordIs);

        return randomWordIs;
    }

    //////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////

    public static int lenghtIs(char[] randomWordIs) {
        int lengtWordIs = randomWordIs.length;
        return lengtWordIs;
    }
    //////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////

    public static char[] fillArrayWithDashOrSpace(char[] randomWordIs, int lengtWordIS) {
        char[] newRandomWordIs = randomWordIs;
        char[] play = new char[lengtWordIS];
        for (int i = 0; i < play.length; i++) {
            if (newRandomWordIs[i] == ' ') {
                play[i] = ' ';
            } else play[i] = '_';
        }
        return play;
    }

    //////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////

    public static char inputAndCheckWord() {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Моля въведете буква: ");
        char input = scaner.nextLine().trim().toLowerCase().charAt(0);
        while(input == 'q' ||input == 'w' ||input == 'e'||input == 'r'||input == 't'||input == 'y'||input == 'u'||input == 'i'||input == 'o'||input == 'p'
                ||input == 'a'||input == 's'||input == 'd'||input == 'f'||input == 'g'||input == 'h'||input == 'j'||input == 'k'||input == 'l'||input == ';'||input == '`'
                ||input == 'z'||input == 'x'||input == 'c'||input == 'v'||input == 'b'||input == 'n'||input == 'm'||input == ','||input == '.'||input == '/'||input == '1'
                ||input == '2'||input == '3'||input == '4'||input == '5'||input == '6'||input == '7'||input == '8'||input == '9'||input == '0'||input == '-'||input == '='
                ||input == '!'||input == '@'||input == '#'||input == '$'||input == '^'||input == '&'||input == '*'||input == '('||input == ')'||input == '<'||input == '_'
                ||input == '+' ||input == '>' ||input == ':' ||input == '|'||input == '['||input == ']'||input == '§'||input == '}'||input == '{'||input == '%'||input == '~'){
            System.out.println("Моля въведете коректни данни: ");
            input = scaner.nextLine().trim().toLowerCase().charAt(0);
        }
        return input;

    }

    //////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////

    public static int findCountMistake(char[] randomWordIS, char input, char[] play) {
        int firstFlag = 0, secondFlag = 0, firstCounter = 0, secondCounter = 0, mistake;
        for (int i = 0; i < randomWordIS.length; i++) {
            if (randomWordIS[i] == input) {
                play[i] = input;
                secondFlag = 1;
            } else {
                firstFlag = 1;
            }
        }
        if (firstFlag == 1) {
            firstCounter++;
        }
        if (secondFlag == 1) {
            secondCounter++;
        }
        mistake = firstCounter - secondCounter;
        return mistake;
    }

    //////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////

    public static boolean winOrPlay(char[] play){
        if (isTheWordGuessed(play)) {
            System.out.println("Вие Спечелихте");
            return true;
        }
        else return false;
    }

    //////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////

    public static void printHangmanAndUsedLetters(char[] randomWordIS) {
        char[] play = fillArrayWithDashOrSpace(randomWordIS, lenghtIs(randomWordIS));
        char[] words = new char[30];
        int j = 0, mistake = 0;
        while (true) {
            printArray(play);
            if (winOrPlay(play)==true) {
                return;
            }
            char inputAndCheckWord = inputAndCheckWord();
            words[j] = inputAndCheckWord;
            j++;
            int findCountMistake = findCountMistake(randomWordIS, inputAndCheckWord, play);
            if (findCountMistake == 1) {
                mistake++;
            }
            switch (mistake) {
                case 1:
                    mistake_1();
                    break;
                case 2:
                    mistake_2();
                    break;
                case 3:
                    mistake_3();
                    break;
                case 4:
                    mistake_4();
                    break;
                case 5:
                    mistake_5();
                    break;
                case 6:
                    mistake_6();
                    break;
                case 7:
                    mistake_7();
                    break;
                case 8:
                    mistake_8();
                    System.out.print("Думата беше: ");
                    for (int i = 0; i < randomWordIS.length; i++)
                        System.out.print("\u001B[34m" + randomWordIS[i]);
                    System.out.println();
                    System.out.println("\u001B[31m" + "          Вие загубихте играта!");
                    return;
            }
            System.out.print("Използвани букви: ");
            for (int i = 0; i < j; i++) {
                System.out.print(words[i] + " ");
            }
            System.out.println();
        }
    }

    //////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////

    public static void printArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////

    public static boolean isTheWordGuessed(char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '_') return false;
        }
        return true;
    }
}

package org.dmgram;

import java.util.Locale;
import java.util.function.Function;

public class EmojiFonts {

    static final Function<String, String> toLowerCase = s -> s.toLowerCase(Locale.ROOT);

    public static String[] emojiFontsNames = {
            "Wide Alphabet",
            "Алфавит",
            "Alphabet",
            "Lazer",
            "Meow meow",
            "Демотиватор",
            "Super Mario 64",
            "Dvach"
    };

    public static EmojiFont[] emojiFonts = {
            new EmojiFont(new long[]{
                    6035301835479190160L,
                    6034839550969252765L,
                    6035013720483047061L,
                    6033067722340832798L,
                    6035202699044064181L,
                    6032595855758855212L,
                    6035305438956751813L,
                    6034931583528471477L,
                    6032781411230944410L,
                    6032794686974855984L,
                    6035022005474954646L,
                    6032814108816969315L,
                    6032681931198434428L,
                    6035295818230008640L,
                    6033032185781423218L,
                    6032963384700308559L,
                    6032689537585515887L,
                    6032776386119208400L,
                    6033083953022242076L,
                    6033092396927945583L,
                    6033020417571031844L,
                    6035047358666902279L,
                    6035125003085680276L,
                    6035134890100395547L,
                    6035197347514813437L,
                    6034924904854326790L},
                    "abcdefghijklmnopqrstuvwxyz",
                    toLowerCase),

            new EmojiFont(new long[]{
                    5456128055414103034L,
                    5456434780503548020L,
                    5456256891548081456L,
                    5454330491341643548L,
                    5456670806136332319L,
                    5456638048420767252L,
                    5456546939279514692L,
                    5454311039434759616L,
                    5456509650373451167L,
                    5456623527136336113L,
                    5456505132067855523L,
                    5456371910772269309L,
                    5456140738452528837L,
                    5453930556871941888L,
                    5453937347215238994L,
                    5456502344634079449L,
                    5456402237536346480L,
                    5456119517019119748L,
                    5456490688092838489L,
                    5456151875302726462L,
                    5454053289857393595L,
                    5454338918067479229L,
                    5454359744363895908L,
                    5454131191974207370L,
                    5456480702293877170L,
                    5454080962331680684L,
                    5456518863078301519L,
                    5454347190174490271L,
                    5453878587767660028L,
                    5454343273164316651L,
                    5456437748325948254L,
                    5454207307384626821L,
                    5454275588774699252L},
                    "абвгдеёжзийклмнопрстуфхцчшщъыьэюя",
                    toLowerCase),

            new EmojiFont(new long[]{6032902164236471239L,
                    6030348458286648381L,
                    6030380674836335648L,
                    6030663373878725803L,
                    6032669651886935022L,
                    6032794729924529597L,
                    6032973486463388995L,
                    6030779655823297970L,
                    6033017376734186738L,
                    6032902623797972103L,
                    6030739996095286579L,
                    6032779856452782933L,
                    6033118269810936920L,
                    6030372557348146420L,
                    6032678473749761092L,
                    6032750852538633161L,
                    6032658631000854452L,
                    6033106823723093634L,
                    6033022951601736655L,
                    6032874534711856088L,
                    6030414287250393828L,
                    6033012162643888864L,
                    6032713988834332099L,
                    6030689461510082519L,
                    6033044984783965208L,
                    6032931765151075341L,
                    6044002356889127932L,
                    6030541495591767119L,
                    6030470899214322593L,
                    6030717868423777346L,
                    6033116620543495287L,
                    6044219652169534473L,
                    6033123896218094530L,
                    6032984777932410105L,
                    6030824366432849413L,
                    6046185647679474430L,
                    6033031399802408686L,
                    6032714843532823639L,
                    6032766619363577074L,
                    6030376521602960830L,
                    6046418181503848313L,
                    6030750630434310932L,
                    6046544848679340757L,
                    6032613495189539415L,
                    6030593164048337780L,
                    6030434568085966278L,
                    6030408175511932773L,
                    6030880269727173905L,
                    6030359290194169552L,
                    6033104066354088714L,
                    6033012008025067358L,
                    6030374601752579421L,
                    6035077578056797187L,
                    6035333132905876080L,
                    6032895330943503887L,
                    6032721217264291023L,
                    6032673431458156049L,
                    6034985489663003154L,
                    6035130569363295212L,
                    6032603363361688717L,
                    6032688352174542779L,
                    6032752080899280021L,
                    6033101201610903072L,
                    6033056731519519862L,
                    6032617102962069967L,
                    6032933036461395383L,
                    6035271044858645168L,
                    6034823612345617299L,
                    6046465675252207359L,
                    6046190518172388655L,
                    6046130349975539355L,
                    6043998478533660177L,
                    5766986209066749416L},
                    "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm1234567890!?.,();:=-@",
                    null),

            new EmojiFont(new long[]{6032692952084517027L,
                    6035079789964954748L,
                    6032800893202599144L,
                    6033077897118354659L,
                    6032769475516828843L,
                    6032690190420544288L,
                    6032774397549349849L,
                    6035322060480187441L,
                    6032834479846854919L,
                    6035046177550896659L,
                    6033126142485990696L,
                    6033132632181574392L,
                    6032660353282738833L,
                    6033015422524067021L,
                    6035207517997370107L,
                    6034825626685279404L,
                    6032622458786286369L,
                    6032687360037096781L,
                    6035118500505193418L,
                    6032701404580155016L,
                    6035025037721864670L,
                    6034971981990857598L,
                    6032726573088509249L,
                    6035368506256526630L,
                    6034922117420551058L,
                    6032606679076441300L,
                    6032700640075975503L,
                    6033000884059770733L,
                    6033076591448296324L,
                    6034942939422002468L,
                    6035228567632087745L,
                    6032797822300982330L,
                    6035269228087478966L,
                    6032852411335314565L,
                    6035012870079515502L,
                    6035067257250384690L},
                    "0123456789abcdefghijklmnopqrstuvwxyz",
                    toLowerCase),

            new EmojiFont(new long[]{5474287615228256282L,
                    5474646116148452705L,
                    5472219644309806256L,
                    5474536551532732710L,
                    5472374142873378039L,
                    5471887961165405047L,
                    5472326412901817384L,
                    5474621579000291126L,
                    5472268950534365124L,
                    5472151577668099943L,
                    5472043602190278956L,
                    5474665842933244236L,
                    5472344610678251783L,
                    5472059734087442438L,
                    5471949529521593965L,
                    5472323810151637154L,
                    5472012047065554619L,
                    5472233439744762184L,
                    5472350516258283380L,
                    5472016041385138963L,
                    5474622704281721848L,
                    5472393985622286253L,
                    5472042451139043893L,
                    5472046995214442103L,
                    5474551377759836746L,
                    5472166932176182244L,
                    5472248119942979563L,
                    5474154789069659414L,
                    5474677705632914620L,
                    5472154953512393636L,
                    5474194440207735805L,
                    5474281048223259966L,
                    5474680892498647707L,
                    5472243799205879486L,
                    5471914899200286905L,
                    5474309442252055790L,
                    5472274757330148606L,
                    5472356554982300848L},
                    "abcdefghijklmnopqrstuvwxyz1234567890!?",
                    toLowerCase),

            new EmojiFont(new long[]{5463015275991408125L,
                    5463131343187613153L,
                    5460881677972675903L,
                    5460792823689257161L,
                    5460878808934523419L,
                    5461046772220566608L,
                    5462920434523576673L,
                    5460754117443986156L,
                    5461056607695675807L,
                    5460859571776003405L,
                    5460987493081949213L,
                    5463274107900535548L,
                    5461055052917513441L,
                    5463382469925410676L,
                    5462985267054909731L,
                    5463002000247495267L,
                    5463314321679326040L,
                    5463095205332786412L,
                    5463278445817502076L,
                    5463064522086421897L,
                    5460648581507587880L,
                    5460683323498045444L,
                    5460807834599956028L,
                    5460706868508762394L,
                    5461024258002002145L,
                    5463347173884173319L,
                    5460807366448521400L,
                    5463391579551046154L,
                    5463156142328783786L,
                    5460912060571329145L,
                    5460717236559814905L,
                    5463183720313788824L,
                    5463277741442866500L,
                    5463170629253471285L,
                    5460710171338613491L,
                    5462952535109147512L},
                    "абвгдеёжзийклмнорпстуфхцчшщъыьэюя!?.",
                    toLowerCase),

            new EmojiFont(new long[]{6034987997923904624L,
                    6032809624871112000L,
                    6035193001007909440L,
                    6035067471998749303L,
                    6035279450109645048L,
                    6034896291782200119L,
                    6035238038034975994L,
                    6032660915923455462L,
                    6035200985352113109L,
                    6034897442833435810L,
                    6033108769343278493L,
                    6035004048216689685L,
                    6035339506637343592L,
                    6035044442384108676L,
                    6032919344105655216L,
                    6032904814231293156L,
                    6034854871117597596L,
                    6035015734822701934L,
                    6035373733231725064L,
                    6032901124854386462L,
                    6033086087620988759L,
                    6035043841088687058L,
                    6032805128040352903L,
                    6035044652837505605L,
                    6035150871673703858L,
                    6035206465730382318L,
                    6032644741076618743L,
                    6035264666832210804L,
                    6032650569347239583L,
                    6035313071113637827L,
                    6035015103462509836L,
                    6032678250411462619L,
                    6032853820084587881L,
                    6035199275955129272L,
                    6035018779954514693L,
                    6035268197295328472L,
                    6032747386500025104L,
                    6032915671908616972L,
                    6035209691250823276L},
                    "0123456789abcdefghijklmnopqrstuvwxyz\"'?",
                    toLowerCase),

            new EmojiFont(new long[]{
                    5458467777503305430L,
                    5458419583675276512L,
                    5456368371719215040L,
                    5458693520984382495L,
                    5458494930286549831L,
                    5458767497501088806L,
                    5458541981653277808L,
                    5458602008116206514L,
                    5458446027788919635L,
                    5458650017260640833L,
                    5458822743665417997L,
                    5456644198813932085L,
                    5458758147357286073L,
                    5456306674514008988L,
                    5458888542564391780L,
                    5458724182755908870L,
                    5458471003023744030L,
                    5458688040606112480L,
                    5458568232493391576L,
                    5458766350744821089L,
                    5458777238486915089L,
                    5458579781660451036L,
                    5456520697029336971L,
                    5456213538148196314L,
                    5458796479940401856L,
                    5456632980359355017L,
                    5458420674596969168L,
                    5456464325583577111L,
                    5456443379028074288L,
                    5456655056491258292L,
                    5456309942984120231L,
                    5458612230138370905L,
                    5458448574704524380L,
                    5460860134416720283L,
                    5463322018260721783L,
                    5460916969718947979L,
                    5462895317554830036L,
                    5463016925258849587L,
                    5460980157277806671L,
                    5463362721665783844L,
                    5461137675203387084L,
                    5463344085802686914L,
                    5460861049244753208L,
                    5463135535075696881L,
                    5460985921123917443L,
                    5460855534506745452L,
                    5461043267527253638L,
                    5460942361565601329L,
                    5461067284984373439L,
                    5462942184237963594L,
                    5461175629829382046L,
                    5461103646177501488L,
                    5460737650539373655L,
                    5460678315566178062L,
                    5463069289500121642L,
                    5461137799757438115L,
                    5460620784479248472L,
                    5461136116130260076L,
                    5463280550351477751L,
                    5460818563428261503L,
                    5463116280737307518L,
                    5461061156066042324L,
                    5462959252437998089L,
                    5461016780463938607L,
                    5463148304013465957L,
                    5461158909521697926L,
                    5458683178703134897L,
                    5456307000931522724L,
                    5456351002871470882L,
                    5456228703677718182L,
                    5456357934948686909L,
                    5458484957372487804L,
                    5456508898754173725L,
                    5456171610677451101L,
                    5456396731388271479L,
                    5458518105930079143L,
                    5458769361516895153L,
                    5458776916364369785L,
                    5467851082749191204L,
                    5467630811056446262L,
                    5458485038976867229L,
                    5458450219676999281L,
                    5463183252162354978L,
                    5456627448441477764L,
                    5456170678669548581L,
                    5458614648204960928L,
                    5458450528914644220L,
                    5458462108146475977L,
                    5458643643529174609L,
                    5458660883527901681L,
                    5458434259578528689L,
                    5458652628600757555L,
                    5458652693025265953L,
                    5458795118435770606L,
                    5458666578654534003L,
                    5460655410505587915L,
                    5458881687796589650L,
                    5456128725429001102L,
                    5461171536725548123L,
                    5458408498364686537L,
                    5456216828093143385L,
                    5204385256097980495L,
                    5201745466118643778L,
                    5204299919392774853L,
                    5204323597547478797L,
                    5204090449542782512L,
                    5201758849236737439L,
                    5201895772794134643L,
                    5204176902939483581L,
                    5204290951501061186L,
                    5204165740319481053L,
                    5201848523858911422L,
                    5204464322150930354L,
                    5204309033313377635L,
                    5201879748271153603L,
                    5202122413923377510L,
                    5202145808610238388L,
                    5204419130505043477L,
                    5201871192696299807L,
                    5202217530269113503L,
                    5201843365603189039L,
                    5201981397262147815L,
                    5202175920625950523L,
                    5202081903791842290L,
                    5204044355953760983L,
                    5204139034212834026L,
                    5204000667546427491L,
                    5204399055827902100L,
                    5204070349095837251L,
                    5204279866190470559L,
                    5204176159910141395L,
                    5204266087935384399L,
                    5204216408048673313L,
                    5206186505252379276L,
                    5204290152637143721L,
                    5204196127213099376L,
                    5204026596263992497L,
                    5204053830651616094L,
                    5204379505136771370L,
                    5204048801244912653L,
                    5204267466619887416L,
                    5206207688031082894L,
                    5204027025760720968L,
                    5204026939861376452L,
                    5204378946791022053L,
                    5204073046335298523L,
                    5203925080416984191L,
                    5206474096262520991L,
                    5204302324574461746L,
                    5203940572364019932L,
                    5203949574615472985L,
                    5206720829248774855L,
                    5204200757187844654L},
                    "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя0123456789!?.,#:;(){}[]<>/\\*+-=%@_—ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz",
                    null),

    };

    public static class EmojiFont {
        private final long[] emojis;
        private final String mapping;
        private final Function<String, String> prepareFunction;

        public EmojiFont(long[] emojis, String mapping, Function<String, String> prepare) {
            this.emojis = emojis;
            this.mapping = mapping;
            this.prepareFunction = prepare;
        }

        public long[] getEmojis() {
            return emojis;
        }

        public Function<String, String> getPrepareFunction() {
            return prepareFunction;
        }

        public String getMapping() {
            return mapping;
        }
    }
}
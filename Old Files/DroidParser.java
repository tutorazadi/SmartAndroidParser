/* DroidParser.java */
/* Generated By:JavaCC: Do not edit this line. DroidParser.java */
public class DroidParser implements DroidParserConstants {

    public static void main(String[] args) throws ParseException {
        DroidParser parser = new DroidParser(System.in);
        System.out.println("Welcome to Droid Interpreter");
        while (true) {
            parser.parseCurrentLine();
        }
    }

  static final public void parseCurrentLine() throws ParseException {String type;
    String name;
    String id;
    String text;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case BUTTON:
    case EDITTEXT:
    case TEXTVIEW:
    case LISTVIEW:{
      type = controlType();
      name = name();
      id = id();
      text = controlText();
      jj_consume_token(EOL);
System.out.println("Java code:");
        System.out.println(type + " " + name + ";");
        System.out.println(name + " = (" + type + ") findViewById(R.id." + id + ");");
        System.out.println(name + ".setText(" + text + ");");
        System.out.println();
        System.out.println("XML code:");
        System.out.println("<" + type);
        System.out.println("    android:layout_width=\u005c"wrap_content\u005c"");
        System.out.println("    android:layout_height=\u005c"wrap_content\u005c"");
        System.out.println("    android:text=" + text + " />");
      break;
      }
    case RELLAYOUT:
    case LINLAYOUT:{
      type = layoutType();
      name = name();
      id = id();
      jj_consume_token(EOL);
System.out.println(type + " " + name + ";");
        System.out.println(name + " = (" + type + ") findViewById(R.id." + id + ");");
      break;
      }
    case CLICK:{
      jj_consume_token(CLICK);
      id = id();
System.out.println(id + ".setOnClickListener(new View.OnClickListener() {");
        System.out.println("@Override");
        System.out.println("\u005ctpublic void onClick(View v) {");
        System.out.println("\u005ct\u005ct// Add click logic here...");
        System.out.println("\u005ct}");
        System.out.println("});");
      break;
      }
    case HELP:{
      jj_consume_token(HELP);
      jj_consume_token(EOL);
System.out.println("Valid types include:");
        System.out.println("[CONTROLTYPE]");
        System.out.println("Button, EditText, TextView, ListView");
        System.out.println("[LAYOUTTYPE]");
        System.out.println("LinearLayout, RelativeLayout");
        System.out.println("Valid names follow the following regex convention:");
        System.out.println("[\u005c"A\u005c"-\u005c"Z\u005c", \u005c"a\u005c"-\u005c"z\u005c"]){1} ([\u005c"A\u005c"-\u005c"Z\u005c", \u005c"a\u005c"-\u005c"z\u005c", \u005c"0\u005c"-\u005c"9\u005c"]");
        System.out.println("Valid commands include:");
        System.out.println("[CONTROLTYPE] name id \u005c"text\u005c"");
        System.out.println("[LAYOUTTYPE] name id");
        System.out.println("CLICK id");
      jj_consume_token(EOL);
      break;
      }
    case 0:{
      jj_consume_token(0);
System.exit(-1);
      break;
      }
    default:
      jj_la1[0] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public String controlType() throws ParseException {Token type;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case BUTTON:{
      type = jj_consume_token(BUTTON);
{if ("" != null) return type.toString();}
      break;
      }
    case EDITTEXT:{
      type = jj_consume_token(EDITTEXT);
{if ("" != null) return type.toString();}
      break;
      }
    case TEXTVIEW:{
      type = jj_consume_token(TEXTVIEW);
{if ("" != null) return type.toString();}
      break;
      }
    case LISTVIEW:{
      type = jj_consume_token(LISTVIEW);
{if ("" != null) return type.toString();}
      break;
      }
    default:
      jj_la1[1] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  static final public String layoutType() throws ParseException {Token type;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case RELLAYOUT:{
      type = jj_consume_token(RELLAYOUT);
{if ("" != null) return type.toString();}
      break;
      }
    case LINLAYOUT:{
      type = jj_consume_token(LINLAYOUT);
{if ("" != null) return type.toString();}
      break;
      }
    default:
      jj_la1[2] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  static final public String name() throws ParseException {Token name;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case VAR:{
      name = jj_consume_token(VAR);
{if ("" != null) return name.toString();}
      break;
      }
    case TEXT:{
      name = jj_consume_token(TEXT);
System.out.println("ERROR: Bad name");
        {if ("" != null) return "";}
      break;
      }
    default:
      jj_la1[3] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  static final public String id() throws ParseException {Token id;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case VAR:{
      id = jj_consume_token(VAR);
{if ("" != null) return id.toString();}
      break;
      }
    case TEXT:{
      id = jj_consume_token(TEXT);
System.out.println("ERROR: Bad ID");
        {if ("" != null) return "";}
      break;
      }
    default:
      jj_la1[4] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  static final public String controlText() throws ParseException {Token text;
    text = jj_consume_token(TEXT);
{if ("" != null) return text.toString();}
    throw new Error("Missing return statement in function");
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public DroidParserTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[5];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x3f91,0x780,0x1800,0xc000,0xc000,};
   }

  /** Constructor with InputStream. */
  public DroidParser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public DroidParser(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new DroidParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public DroidParser(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new DroidParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public DroidParser(DroidParserTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(DroidParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk_f() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[21];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 5; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 21; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
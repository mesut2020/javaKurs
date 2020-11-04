package Day37_Public_default_friendly_private.instanceModifiers.publicModifier.same;

public class ChromeBrowser {
    public static void main(String[] args) {

        searchEngine google = new searchEngine("chrome");
        google.name = "Chrome";  // public

        System.out.println("google = " + google);
    }
}

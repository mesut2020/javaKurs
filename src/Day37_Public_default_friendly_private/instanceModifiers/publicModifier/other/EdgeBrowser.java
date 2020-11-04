package Day37_Public_default_friendly_private.instanceModifiers.publicModifier.other;

import Day37_Public_default_friendly_private.instanceModifiers.publicModifier.same.searchEngine;

public class EdgeBrowser {

    public static void main(String[] args) {

        searchEngine microsoft = new searchEngine("explorer");
        microsoft.name = "Edge";

        System.out.println("microsoft = " + microsoft);

    }

}

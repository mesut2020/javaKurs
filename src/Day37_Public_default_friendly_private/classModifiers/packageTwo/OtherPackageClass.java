package Day37_Public_default_friendly_private.classModifiers.packageTwo;

import Day37_Public_default_friendly_private.classModifiers.packageOne.PublicModifierClass;
// Diger paketteki default a erisemedik
public class OtherPackageClass {
    public static void main(String[] args) {
        PublicModifierClass sm3 = new PublicModifierClass();
        // DefaultModifierClass sm4 = new DefaultModifierClass(); //default packageOne da oldugu icin, packeageTwo dan erisilemez...


    }

}

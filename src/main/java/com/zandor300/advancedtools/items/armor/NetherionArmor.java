package com.zandor300.advancedtools.items.armor;

import com.zandor300.advancedtools.creativetab.CreativeTabATTools;
import com.zandor300.advancedtools.items.genericitems.ATItemArmor;
import com.zandor300.advancedtools.reference.Reference;

public class NetherionArmor extends ATItemArmor {
    public NetherionArmor(String name, String texture, ArmorMaterial material, int j) {
        super(material, j, j);
        this.setCreativeTab(CreativeTabATTools.tab);
        this.setUnlocalizedName(name);
        this.setTextureName(Reference.MOD_ID + ":" + texture);
    }
    /*@Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot,
                                  String type) {
        if (stack.getItem() == ModItems.netherionHelmet
                || stack.getItem() == ModItems.netherionChestplate
                || stack.getItem() == ModItems.netherionBoots)
            return Reference.MOD_ID + ":textures/models/armor/emerald_1.png";
        if (stack.getItem() == ModItems.netherionLeggings)
            return Reference.MOD_ID + ":textures/models/armor/emerald_2.png";
        return null;
    }*/
}

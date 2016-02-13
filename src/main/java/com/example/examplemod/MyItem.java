package com.example.examplemod;

import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by nakanoyoshiki on 2016/02/06.
 */
public class MyItem extends ItemSword {
    public MyItem(){
        super(EnumHelper.addToolMaterial("Original_sword",4,2000,16.0f,1.0f,22));
        setUnlocalizedName(ExampleMod.MODID + "_Original_Sword");
        setTextureName(ExampleMod.MODID + ":Original_Sword");
    }
}

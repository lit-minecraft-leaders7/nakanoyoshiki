package com.example.examplemod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSnowball;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by nakanoyoshiki on 2016/02/08.
 */
public class ItemMySnowball extends ItemSnowball {
    public ItemMySnowball(){
        super();
        setUnlocalizedName(ExampleMod.MODID + "_snowball");
        setTextureName("snowball");
    }

    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player){
        if (!player.capabilities.isCreativeMode){
            --itemStack.stackSize;
        }
        world.playSoundAtEntity(player,"random.bow",0.5F,0.4F/(itemRand.nextFloat()*0.4F + 0.8F));
        if (!world.isRemote){
            world.spawnEntityInWorld(new EntityMySnowball(world,player));
        }
        return itemStack;
    }
}

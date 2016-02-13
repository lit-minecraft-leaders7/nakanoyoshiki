package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.IIcon;

/**
 * Created by nakanoyoshiki on 2016/02/06.
 */
public class MyBlock extends Block{
    public MyBlock(){
        super(Material.rock);
        setCreativeTab(CreativeTabs.tabBlock);
        setBlockTextureName(ExampleMod.MODID + ":" + "myblock");
        setBlockName(ExampleMod.MODID + "_" + "myblock");
        setHardness(10.0F);
        setResistance(30.0f);
    }
    public IIcon[] icons = new IIcon[6];

    @Override
    public boolean isOpaqueCube(){return  true;}

    @Override
    public void registerBlockIcons(IIconRegister register){
        for(int i=0;i<6;i++){
            this.icons[i] = register.registerIcon(textureName + "_" + i);
        }
    }

    @Override
    public IIcon getIcon(int side, int metadata){
        return icons[side];
    }

}

package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

/**
 * Created by nakanoyoshiki on 2016/02/08.
 */
public class BlockRedStoneInput extends Block {
    public IIcon[] icons = new IIcon[4];
    public BlockRedStoneInput(){
        super(Material.rock);
        setCreativeTab(CreativeTabs.tabRedstone);
        setBlockName(ExampleMod.MODID + "BlockRedstoneInput");
        setBlockTextureName(ExampleMod.MODID +":" + "redstone_input");
        setHardness(100F);
    }
    @Override
    public void registerBlockIcons(IIconRegister register){
        for(int i= 0; i<4;i++){
            this.icons[i] = register.registerIcon(textureName + "_" + i);
        }
    }
    @Override
    public IIcon getIcon(int side , int metadata){
        return icons[metadata];
    }
    @Override
    public boolean canConnectRedstone(IBlockAccess world, int x, int y, int z, int side ){
        return true;
    }
    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block block){
        int sum  = world.getBlockPowerInput(x,y,z);

        if(sum != 0) {
            System.out.println("Start Inout");
            System.out.println("Input " + sum);
        }else {
            System.out.println("End Input");
        }
        world.setBlockMetadataWithNotify(x,y,z,sum /4, 2);
    }

}

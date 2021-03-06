package bstramke.OresDropMores2.Blocks;

import java.util.Random;

import bstramke.OresDropMores2.OresDropMores2;
import net.minecraft.block.BlockGlowStone;
import net.minecraft.block.material.Material;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class ODMBlockGlowStone extends BlockGlowStone {

	public ODMBlockGlowStone(int par1, Material par2Material) {
		super(par1, par2Material);
	}

	@Override
	public int quantityDropped(Random par1Random) {
		return MathHelper.getRandomIntegerInRange(par1Random, OresDropMores2.GlowstoneOreDropMin, OresDropMores2.GlowstoneOreDropMax);
	}

	@Override
	public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7) {
		super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, par7);
		this.dropXpOnBlockBreak(par1World, par2, par3, par4,
				MathHelper.getRandomIntegerInRange(par1World.rand, OresDropMores2.GlowstoneOreHarvestXPMin, OresDropMores2.GlowstoneOreHarvestXPMax));
	}
	
}

package bstramke.OresDropMores2.Blocks;

import java.util.Random;

import net.minecraft.block.BlockOre;

public class ODMBlockOreDrop extends BlockOre {

	public ODMBlockOreDrop(int par1, int par2) {
		super(par1, par2);
	}

	@Override
	public int quantityDropped(Random par1Random) {
		return 1 + par1Random.nextInt(3);
	}
	
}

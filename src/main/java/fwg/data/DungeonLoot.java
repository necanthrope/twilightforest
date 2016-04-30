package fwg.data;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.ChestGenHooks;

import java.util.Random;

public class DungeonLoot 
{
	public static Item getRandomRecord(Random rand)
	{
		switch(rand.nextInt(12))
		{
			case 0: return Items.record_11;
			case 1: return Items.record_13;
			case 2: return Items.record_blocks;
			case 3: return Items.record_cat;
			case 4: return Items.record_chirp;
			case 5: return Items.record_far;
			case 6: return Items.record_mall;
			case 7: return Items.record_mellohi;
			case 8: return Items.record_stal;
			case 9: return Items.record_strad;
			case 10: return Items.record_wait;
			case 11: return Items.record_ward;
		}
		
		return Items.record_11;
	}
	
    public static ItemStack pickCheckLootItem(Random par1Random, int listitem, int chestID)
    {

       	if(chestID == 1) {
   			int i = par1Random.nextInt(21);
   			if (i == 0) { return new ItemStack(Items.potato, par1Random.nextInt(4) + 1); }
   			if (i == 1) { return new ItemStack(Items.carrot, par1Random.nextInt(4) + 1); }
   			if (i == 2) { return new ItemStack(Items.emerald, par1Random.nextInt(4) + 1); }
   			if (i == 3) { return new ItemStack(Items.melon_seeds, par1Random.nextInt(4) + 1); }
   			if (i == 4) { return new ItemStack(Items.pumpkin_seeds, par1Random.nextInt(4) + 1); }
   			if (i == 5) { return new ItemStack(Blocks.vine, par1Random.nextInt(4) + 1); }
   			if (i == 6 && par1Random.nextInt(3) == 0) { return new ItemStack(Blocks.mycelium); }
   			if (i == 7) { return new ItemStack(Blocks.sapling, 1, 3); }
   			if (i == 8) { return new ItemStack(Blocks.waterlily, par1Random.nextInt(4) + 1); }
   			if (i == 9 || i == 10 || i == 11) { return new ItemStack(Items.water_bucket, par1Random.nextInt(2) + 1); }
   			if (i == 12 || i == 13 || i == 14) { return new ItemStack(Items.lava_bucket, par1Random.nextInt(2) + 1); }
   			else { return ChestGenHooks.getOneItem(ChestGenHooks.DUNGEON_CHEST, par1Random); }
  		}

    	return ChestGenHooks.getOneItem(ChestGenHooks.DUNGEON_CHEST, par1Random);
    }
}
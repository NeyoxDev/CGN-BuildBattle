package fr.neyox.bb.utils;

import org.bukkit.Location;
import org.bukkit.block.Block;

public interface BlockArea extends Iterable<Block>, Cloneable {
	
	boolean contains(Block paramBlock);

	boolean contains(Location paramLocation);

	BlockArea clone();
}

package yarnwrap.world.chunk;
public class EntryMissingException { public net.minecraft.world.chunk.EntryMissingException wrapperContained; public EntryMissingException(net.minecraft.world.chunk.EntryMissingException wrapperContained) { this.wrapperContained = wrapperContained; }

public EntryMissingException(int index) { this.wrapperContained = new net.minecraft.world.chunk.EntryMissingException(index); }

}
package yarnwrap.block.enums;
public class NoteBlockInstrument { public net.minecraft.block.enums.NoteBlockInstrument wrapperContained; public NoteBlockInstrument(net.minecraft.block.enums.NoteBlockInstrument wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public yarnwrap.registry.entry.RegistryEntry sound() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.sound); }
// public Object type() { return wrapperContained.type; }
public yarnwrap.registry.entry.RegistryEntry getSound() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getSound()); }
public boolean canBePitched() { return wrapperContained.canBePitched(); }
public boolean hasCustomSound() { return wrapperContained.hasCustomSound(); }
public boolean isNotBaseBlock() { return wrapperContained.isNotBaseBlock(); }

}
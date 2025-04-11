package yarnwrap.block.enums;
public class NoteBlockInstrument { public net.minecraft.block.enums.NoteBlockInstrument wrapperContained; public NoteBlockInstrument(net.minecraft.block.enums.NoteBlockInstrument wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public yarnwrap.registry.entry.RegistryEntry sound() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.sound); }
// public void sound(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.sound = value.wrapperContained; }
// public Object type() { return wrapperContained.type; }
// // public void type(Object value) { wrapperContained.type = value; }
// // public NoteBlockInstrument(java.lang.String name,int sound,java.lang.String type) { this.wrapperContained = new net.minecraft.block.enums.NoteBlockInstrument(name,sound,type); }
public yarnwrap.registry.entry.RegistryEntry getSound() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getSound()); }
public boolean canBePitched() { return wrapperContained.canBePitched(); }
public boolean hasCustomSound() { return wrapperContained.hasCustomSound(); }
public boolean isNotBaseBlock() { return wrapperContained.isNotBaseBlock(); }

}
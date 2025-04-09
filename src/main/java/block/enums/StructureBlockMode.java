package yarnwrap.block.enums;
public class StructureBlockMode { public net.minecraft.block.enums.StructureBlockMode wrapperContained; public StructureBlockMode(net.minecraft.block.enums.StructureBlockMode wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public yarnwrap.text.Text text() { return new yarnwrap.text.Text(wrapperContained.text); }
public yarnwrap.text.Text asText() { return new yarnwrap.text.Text(wrapperContained.asText()); }

}
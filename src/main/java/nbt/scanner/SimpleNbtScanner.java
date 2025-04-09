package yarnwrap.nbt.scanner;
public class SimpleNbtScanner { public net.minecraft.nbt.scanner.SimpleNbtScanner wrapperContained; public SimpleNbtScanner(net.minecraft.nbt.scanner.SimpleNbtScanner wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.nbt.scanner.SimpleNbtScanner NOOP() { return new yarnwrap.nbt.scanner.SimpleNbtScanner(wrapperContained.NOOP); }

}
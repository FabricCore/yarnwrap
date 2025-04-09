package yarnwrap.world.gen;
public class YOffset { public net.minecraft.world.gen.YOffset wrapperContained; public YOffset(net.minecraft.world.gen.YOffset wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec OFFSET_CODEC() { return wrapperContained.OFFSET_CODEC; }
public yarnwrap.world.gen.YOffset BOTTOM() { return new yarnwrap.world.gen.YOffset(wrapperContained.BOTTOM); }
public yarnwrap.world.gen.YOffset TOP() { return new yarnwrap.world.gen.YOffset(wrapperContained.TOP); }
// public yarnwrap.world.gen.YOffset getBottom() { return new yarnwrap.world.gen.YOffset(wrapperContained.getBottom()); }
// public yarnwrap.world.gen.YOffset fixed(int offset) { return new yarnwrap.world.gen.YOffset(wrapperContained.fixed(offset)); }
// // public com.mojang.datafixers.util.Either map(yarnwrap.world.gen.YOffset yOffset) { return wrapperContained.map(yOffset.wrapperContained); }
// // public yarnwrap.world.gen.YOffset fromEither(com.mojang.datafixers.util.Either either) { return new yarnwrap.world.gen.YOffset(wrapperContained.fromEither(either)); }
public int getY(yarnwrap.world.gen.HeightContext context) { return wrapperContained.getY(context.wrapperContained); }
// public yarnwrap.world.gen.YOffset getTop() { return new yarnwrap.world.gen.YOffset(wrapperContained.getTop()); }
// public yarnwrap.world.gen.YOffset aboveBottom(int offset) { return new yarnwrap.world.gen.YOffset(wrapperContained.aboveBottom(offset)); }
// public yarnwrap.world.gen.YOffset belowTop(int offset) { return new yarnwrap.world.gen.YOffset(wrapperContained.belowTop(offset)); }

}
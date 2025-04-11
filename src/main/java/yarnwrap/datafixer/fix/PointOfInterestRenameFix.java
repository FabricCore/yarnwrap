package yarnwrap.datafixer.fix;
public class PointOfInterestRenameFix { public net.minecraft.datafixer.fix.PointOfInterestRenameFix wrapperContained; public PointOfInterestRenameFix(net.minecraft.datafixer.fix.PointOfInterestRenameFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Function renamer() { return wrapperContained.renamer; }
// public void renamer(java.util.function.Function value) { wrapperContained.renamer = value; }
public PointOfInterestRenameFix(com.mojang.datafixers.schemas.Schema outputSchema,java.lang.String name,java.util.function.Function renamer) { this.wrapperContained = new net.minecraft.datafixer.fix.PointOfInterestRenameFix(outputSchema,name,renamer); }

}
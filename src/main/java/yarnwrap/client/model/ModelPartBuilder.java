package yarnwrap.client.model;
public class ModelPartBuilder { public net.minecraft.client.model.ModelPartBuilder wrapperContained; public ModelPartBuilder(net.minecraft.client.model.ModelPartBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List cuboidData() { return wrapperContained.cuboidData; }
// public void cuboidData(java.util.List value) { wrapperContained.cuboidData = value; }
// public static java.util.List cuboidData() { return net.minecraft.client.model.ModelPartBuilder.cuboidData; }
// public static void cuboidData(java.util.List value, ) { net.minecraft.client.model.ModelPartBuilder.cuboidData = value; }

// public int textureX() { return wrapperContained.textureX; }
// public void textureX(int value) { wrapperContained.textureX = value; }
// public static int textureX() { return net.minecraft.client.model.ModelPartBuilder.textureX; }
// public static void textureX(int value, ) { net.minecraft.client.model.ModelPartBuilder.textureX = value; }

// public int textureY() { return wrapperContained.textureY; }
// public void textureY(int value) { wrapperContained.textureY = value; }
// public static int textureY() { return net.minecraft.client.model.ModelPartBuilder.textureY; }
// public static void textureY(int value, ) { net.minecraft.client.model.ModelPartBuilder.textureY = value; }

// public boolean mirror() { return wrapperContained.mirror; }
// public void mirror(boolean value) { wrapperContained.mirror = value; }
// public static boolean mirror() { return net.minecraft.client.model.ModelPartBuilder.mirror; }
// public static void mirror(boolean value, ) { net.minecraft.client.model.ModelPartBuilder.mirror = value; }

// public java.util.Set ALL_DIRECTIONS() { return wrapperContained.ALL_DIRECTIONS; }
// public void ALL_DIRECTIONS(java.util.Set value) { wrapperContained.ALL_DIRECTIONS = value; }
// public static java.util.Set ALL_DIRECTIONS() { return net.minecraft.client.model.ModelPartBuilder.ALL_DIRECTIONS; }
// public static void ALL_DIRECTIONS(java.util.Set value, ) { net.minecraft.client.model.ModelPartBuilder.ALL_DIRECTIONS = value; }

public yarnwrap.client.model.ModelPartBuilder mirrored() { return new yarnwrap.client.model.ModelPartBuilder(wrapperContained.mirrored()); }
// public static yarnwrap.client.model.ModelPartBuilder mirrored() { return new yarnwrap.client.model.ModelPartBuilder(net.minecraft.client.model.ModelPartBuilder.mirrored()); }
public yarnwrap.client.model.ModelPartBuilder cuboid(float offsetX,float offsetY,float offsetZ,float sizeX,float sizeY,float sizeZ) { return new yarnwrap.client.model.ModelPartBuilder(wrapperContained.cuboid(offsetX,offsetY,offsetZ,sizeX,sizeY,sizeZ)); }
// public static yarnwrap.client.model.ModelPartBuilder cuboid(float offsetX,float offsetY,float offsetZ,float sizeX,float sizeY,float sizeZ, ) { return new yarnwrap.client.model.ModelPartBuilder(net.minecraft.client.model.ModelPartBuilder.cuboid(offsetX,offsetY,offsetZ,sizeX,sizeY,sizeZ)); }
public yarnwrap.client.model.ModelPartBuilder cuboid(float offsetX,float offsetY,float offsetZ,float sizeX,float sizeY,float sizeZ,yarnwrap.client.model.Dilation extra) { return new yarnwrap.client.model.ModelPartBuilder(wrapperContained.cuboid(offsetX,offsetY,offsetZ,sizeX,sizeY,sizeZ,extra.wrapperContained)); }
// public static yarnwrap.client.model.ModelPartBuilder cuboid(float offsetX,float offsetY,float offsetZ,float sizeX,float sizeY,float sizeZ,yarnwrap.client.model.Dilation extra, ) { return new yarnwrap.client.model.ModelPartBuilder(net.minecraft.client.model.ModelPartBuilder.cuboid(offsetX,offsetY,offsetZ,sizeX,sizeY,sizeZ,extra.wrapperContained)); }
public yarnwrap.client.model.ModelPartBuilder cuboid(float offsetX,float offsetY,float offsetZ,float sizeX,float sizeY,float sizeZ,yarnwrap.client.model.Dilation extra,float textureScaleX,float textureScaleY) { return new yarnwrap.client.model.ModelPartBuilder(wrapperContained.cuboid(offsetX,offsetY,offsetZ,sizeX,sizeY,sizeZ,extra.wrapperContained,textureScaleX,textureScaleY)); }
// public static yarnwrap.client.model.ModelPartBuilder cuboid(float offsetX,float offsetY,float offsetZ,float sizeX,float sizeY,float sizeZ,yarnwrap.client.model.Dilation extra,float textureScaleX,float textureScaleY, ) { return new yarnwrap.client.model.ModelPartBuilder(net.minecraft.client.model.ModelPartBuilder.cuboid(offsetX,offsetY,offsetZ,sizeX,sizeY,sizeZ,extra.wrapperContained,textureScaleX,textureScaleY)); }
public yarnwrap.client.model.ModelPartBuilder cuboid(float offsetX,float offsetY,float offsetZ,float sizeX,float sizeY,float sizeZ,boolean mirror) { return new yarnwrap.client.model.ModelPartBuilder(wrapperContained.cuboid(offsetX,offsetY,offsetZ,sizeX,sizeY,sizeZ,mirror)); }
// public static yarnwrap.client.model.ModelPartBuilder cuboid(float offsetX,float offsetY,float offsetZ,float sizeX,float sizeY,float sizeZ,boolean mirror, ) { return new yarnwrap.client.model.ModelPartBuilder(net.minecraft.client.model.ModelPartBuilder.cuboid(offsetX,offsetY,offsetZ,sizeX,sizeY,sizeZ,mirror)); }
public yarnwrap.client.model.ModelPartBuilder uv(int textureX,int textureY) { return new yarnwrap.client.model.ModelPartBuilder(wrapperContained.uv(textureX,textureY)); }
// public static yarnwrap.client.model.ModelPartBuilder uv(int textureX,int textureY, ) { return new yarnwrap.client.model.ModelPartBuilder(net.minecraft.client.model.ModelPartBuilder.uv(textureX,textureY)); }
public yarnwrap.client.model.ModelPartBuilder cuboid(java.lang.String name,float offsetX,float offsetY,float offsetZ,float sizeX,float sizeY,float sizeZ) { return new yarnwrap.client.model.ModelPartBuilder(wrapperContained.cuboid(name,offsetX,offsetY,offsetZ,sizeX,sizeY,sizeZ)); }
// public static yarnwrap.client.model.ModelPartBuilder cuboid(java.lang.String name,float offsetX,float offsetY,float offsetZ,float sizeX,float sizeY,float sizeZ, ) { return new yarnwrap.client.model.ModelPartBuilder(net.minecraft.client.model.ModelPartBuilder.cuboid(name,offsetX,offsetY,offsetZ,sizeX,sizeY,sizeZ)); }
public yarnwrap.client.model.ModelPartBuilder cuboid(java.lang.String name,float offsetX,float offsetY,float offsetZ,float sizeX,float sizeY,float sizeZ,yarnwrap.client.model.Dilation extra) { return new yarnwrap.client.model.ModelPartBuilder(wrapperContained.cuboid(name,offsetX,offsetY,offsetZ,sizeX,sizeY,sizeZ,extra.wrapperContained)); }
// public static yarnwrap.client.model.ModelPartBuilder cuboid(java.lang.String name,float offsetX,float offsetY,float offsetZ,float sizeX,float sizeY,float sizeZ,yarnwrap.client.model.Dilation extra, ) { return new yarnwrap.client.model.ModelPartBuilder(net.minecraft.client.model.ModelPartBuilder.cuboid(name,offsetX,offsetY,offsetZ,sizeX,sizeY,sizeZ,extra.wrapperContained)); }
public yarnwrap.client.model.ModelPartBuilder cuboid(java.lang.String name,float offsetX,float offsetY,float offsetZ,int sizeX,int sizeY,int sizeZ,int textureX,int textureY) { return new yarnwrap.client.model.ModelPartBuilder(wrapperContained.cuboid(name,offsetX,offsetY,offsetZ,sizeX,sizeY,sizeZ,textureX,textureY)); }
// public static yarnwrap.client.model.ModelPartBuilder cuboid(java.lang.String name,float offsetX,float offsetY,float offsetZ,int sizeX,int sizeY,int sizeZ,int textureX,int textureY, ) { return new yarnwrap.client.model.ModelPartBuilder(net.minecraft.client.model.ModelPartBuilder.cuboid(name,offsetX,offsetY,offsetZ,sizeX,sizeY,sizeZ,textureX,textureY)); }
public yarnwrap.client.model.ModelPartBuilder cuboid(java.lang.String name,float offsetX,float offsetY,float offsetZ,int sizeX,int sizeY,int sizeZ,yarnwrap.client.model.Dilation extra,int textureX,int textureY) { return new yarnwrap.client.model.ModelPartBuilder(wrapperContained.cuboid(name,offsetX,offsetY,offsetZ,sizeX,sizeY,sizeZ,extra.wrapperContained,textureX,textureY)); }
// public static yarnwrap.client.model.ModelPartBuilder cuboid(java.lang.String name,float offsetX,float offsetY,float offsetZ,int sizeX,int sizeY,int sizeZ,yarnwrap.client.model.Dilation extra,int textureX,int textureY, ) { return new yarnwrap.client.model.ModelPartBuilder(net.minecraft.client.model.ModelPartBuilder.cuboid(name,offsetX,offsetY,offsetZ,sizeX,sizeY,sizeZ,extra.wrapperContained,textureX,textureY)); }
public yarnwrap.client.model.ModelPartBuilder mirrored(boolean mirror) { return new yarnwrap.client.model.ModelPartBuilder(wrapperContained.mirrored(mirror)); }
// public static yarnwrap.client.model.ModelPartBuilder mirrored(boolean mirror, ) { return new yarnwrap.client.model.ModelPartBuilder(net.minecraft.client.model.ModelPartBuilder.mirrored(mirror)); }
public java.util.List build() { return wrapperContained.build(); }
// public static java.util.List build() { return net.minecraft.client.model.ModelPartBuilder.build(); }
// public yarnwrap.client.model.ModelPartBuilder create() { return new yarnwrap.client.model.ModelPartBuilder(wrapperContained.create()); }
public static yarnwrap.client.model.ModelPartBuilder create() { return new yarnwrap.client.model.ModelPartBuilder(net.minecraft.client.model.ModelPartBuilder.create()); }
public yarnwrap.client.model.ModelPartBuilder cuboid(float offsetX,float offsetY,float offsetZ,float sizeX,float sizeY,float sizeZ,java.util.Set directions) { return new yarnwrap.client.model.ModelPartBuilder(wrapperContained.cuboid(offsetX,offsetY,offsetZ,sizeX,sizeY,sizeZ,directions)); }
// public static yarnwrap.client.model.ModelPartBuilder cuboid(float offsetX,float offsetY,float offsetZ,float sizeX,float sizeY,float sizeZ,java.util.Set directions, ) { return new yarnwrap.client.model.ModelPartBuilder(net.minecraft.client.model.ModelPartBuilder.cuboid(offsetX,offsetY,offsetZ,sizeX,sizeY,sizeZ,directions)); }

}
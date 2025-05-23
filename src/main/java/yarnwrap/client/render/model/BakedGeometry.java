package yarnwrap.client.render.model;
public class BakedGeometry { public net.minecraft.client.render.model.BakedGeometry wrapperContained; public BakedGeometry(net.minecraft.client.render.model.BakedGeometry wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.model.BakedGeometry EMPTY() { return new yarnwrap.client.render.model.BakedGeometry(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.client.render.model.BakedGeometry value) { wrapperContained.EMPTY = value.wrapperContained; }
public static yarnwrap.client.render.model.BakedGeometry EMPTY() { return new yarnwrap.client.render.model.BakedGeometry(net.minecraft.client.render.model.BakedGeometry.EMPTY); }
// public static void EMPTY(yarnwrap.client.render.model.BakedGeometry value, ) { net.minecraft.client.render.model.BakedGeometry.EMPTY = value.wrapperContained; }

// public java.util.List allQuads() { return wrapperContained.allQuads; }
// public void allQuads(java.util.List value) { wrapperContained.allQuads = value; }
// public static java.util.List allQuads() { return net.minecraft.client.render.model.BakedGeometry.allQuads; }
// public static void allQuads(java.util.List value, ) { net.minecraft.client.render.model.BakedGeometry.allQuads = value; }

// public java.util.List sidelessQuads() { return wrapperContained.sidelessQuads; }
// public void sidelessQuads(java.util.List value) { wrapperContained.sidelessQuads = value; }
// public static java.util.List sidelessQuads() { return net.minecraft.client.render.model.BakedGeometry.sidelessQuads; }
// public static void sidelessQuads(java.util.List value, ) { net.minecraft.client.render.model.BakedGeometry.sidelessQuads = value; }

// public java.util.List northQuads() { return wrapperContained.northQuads; }
// public void northQuads(java.util.List value) { wrapperContained.northQuads = value; }
// public static java.util.List northQuads() { return net.minecraft.client.render.model.BakedGeometry.northQuads; }
// public static void northQuads(java.util.List value, ) { net.minecraft.client.render.model.BakedGeometry.northQuads = value; }

// public java.util.List southQuads() { return wrapperContained.southQuads; }
// public void southQuads(java.util.List value) { wrapperContained.southQuads = value; }
// public static java.util.List southQuads() { return net.minecraft.client.render.model.BakedGeometry.southQuads; }
// public static void southQuads(java.util.List value, ) { net.minecraft.client.render.model.BakedGeometry.southQuads = value; }

// public java.util.List eastQuads() { return wrapperContained.eastQuads; }
// public void eastQuads(java.util.List value) { wrapperContained.eastQuads = value; }
// public static java.util.List eastQuads() { return net.minecraft.client.render.model.BakedGeometry.eastQuads; }
// public static void eastQuads(java.util.List value, ) { net.minecraft.client.render.model.BakedGeometry.eastQuads = value; }

// public java.util.List westQuads() { return wrapperContained.westQuads; }
// public void westQuads(java.util.List value) { wrapperContained.westQuads = value; }
// public static java.util.List westQuads() { return net.minecraft.client.render.model.BakedGeometry.westQuads; }
// public static void westQuads(java.util.List value, ) { net.minecraft.client.render.model.BakedGeometry.westQuads = value; }

// public java.util.List upQuads() { return wrapperContained.upQuads; }
// public void upQuads(java.util.List value) { wrapperContained.upQuads = value; }
// public static java.util.List upQuads() { return net.minecraft.client.render.model.BakedGeometry.upQuads; }
// public static void upQuads(java.util.List value, ) { net.minecraft.client.render.model.BakedGeometry.upQuads = value; }

// public java.util.List downQuads() { return wrapperContained.downQuads; }
// public void downQuads(java.util.List value) { wrapperContained.downQuads = value; }
// public static java.util.List downQuads() { return net.minecraft.client.render.model.BakedGeometry.downQuads; }
// public static void downQuads(java.util.List value, ) { net.minecraft.client.render.model.BakedGeometry.downQuads = value; }

// public BakedGeometry(java.util.List allQuads,java.util.List sidelessQuads,java.util.List northQuads,java.util.List southQuads,java.util.List eastQuads,java.util.List westQuads,java.util.List upQuads,java.util.List downQuads) { this.wrapperContained = new net.minecraft.client.render.model.BakedGeometry(allQuads,sidelessQuads,northQuads,southQuads,eastQuads,westQuads,upQuads,downQuads); }
public java.util.List getAllQuads() { return wrapperContained.getAllQuads(); }
// public static java.util.List getAllQuads() { return net.minecraft.client.render.model.BakedGeometry.getAllQuads(); }
public java.util.List getQuads(yarnwrap.util.math.Direction side) { return wrapperContained.getQuads(side.wrapperContained); }
// public static java.util.List getQuads(yarnwrap.util.math.Direction side, ) { return net.minecraft.client.render.model.BakedGeometry.getQuads(side.wrapperContained); }

}
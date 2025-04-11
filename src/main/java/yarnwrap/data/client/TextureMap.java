package yarnwrap.data.client;
public class TextureMap { public net.minecraft.data.client.TextureMap wrapperContained; public TextureMap(net.minecraft.data.client.TextureMap wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map entries() { return wrapperContained.entries; }
// public void entries(java.util.Map value) { wrapperContained.entries = value; }
// public java.util.Set inherited() { return wrapperContained.inherited; }
// public void inherited(java.util.Set value) { wrapperContained.inherited = value; }
public yarnwrap.util.Identifier getId(yarnwrap.block.Block block) { return new yarnwrap.util.Identifier(wrapperContained.getId(block.wrapperContained)); }
public java.util.stream.Stream getInherited() { return wrapperContained.getInherited(); }
public yarnwrap.data.client.TextureMap particle(yarnwrap.item.Item item) { return new yarnwrap.data.client.TextureMap(wrapperContained.particle(item.wrapperContained)); }
public yarnwrap.util.Identifier getSubId(yarnwrap.item.Item item,java.lang.String suffix) { return new yarnwrap.util.Identifier(wrapperContained.getSubId(item.wrapperContained,suffix)); }
public yarnwrap.data.client.TextureMap all(yarnwrap.block.Block block) { return new yarnwrap.data.client.TextureMap(wrapperContained.all(block.wrapperContained)); }
public yarnwrap.data.client.TextureMap stemAndUpper(yarnwrap.block.Block stem,yarnwrap.block.Block upper) { return new yarnwrap.data.client.TextureMap(wrapperContained.stemAndUpper(stem.wrapperContained,upper.wrapperContained)); }
public yarnwrap.util.Identifier getSubId(yarnwrap.block.Block block,java.lang.String suffix) { return new yarnwrap.util.Identifier(wrapperContained.getSubId(block.wrapperContained,suffix)); }
public yarnwrap.util.Identifier getTexture(yarnwrap.data.client.TextureKey key) { return new yarnwrap.util.Identifier(wrapperContained.getTexture(key.wrapperContained)); }
public yarnwrap.data.client.TextureMap put(yarnwrap.data.client.TextureKey key,yarnwrap.util.Identifier id) { return new yarnwrap.data.client.TextureMap(wrapperContained.put(key.wrapperContained,id.wrapperContained)); }
public yarnwrap.data.client.TextureMap texture(yarnwrap.util.Identifier id) { return new yarnwrap.data.client.TextureMap(wrapperContained.texture(id.wrapperContained)); }
public yarnwrap.data.client.TextureMap sideEnd(yarnwrap.util.Identifier side,yarnwrap.util.Identifier end) { return new yarnwrap.data.client.TextureMap(wrapperContained.sideEnd(side.wrapperContained,end.wrapperContained)); }
public yarnwrap.data.client.TextureMap layer0(yarnwrap.item.Item item) { return new yarnwrap.data.client.TextureMap(wrapperContained.layer0(item.wrapperContained)); }
public yarnwrap.data.client.TextureMap texture(yarnwrap.block.Block block) { return new yarnwrap.data.client.TextureMap(wrapperContained.texture(block.wrapperContained)); }
public yarnwrap.data.client.TextureMap paneAndTopForEdge(yarnwrap.block.Block block,yarnwrap.block.Block top) { return new yarnwrap.data.client.TextureMap(wrapperContained.paneAndTopForEdge(block.wrapperContained,top.wrapperContained)); }
public yarnwrap.data.client.TextureMap inherit(yarnwrap.data.client.TextureKey parent,yarnwrap.data.client.TextureKey child) { return new yarnwrap.data.client.TextureMap(wrapperContained.inherit(parent.wrapperContained,child.wrapperContained)); }
public yarnwrap.data.client.TextureMap all(yarnwrap.util.Identifier id) { return new yarnwrap.data.client.TextureMap(wrapperContained.all(id.wrapperContained)); }
public yarnwrap.util.Identifier getId(yarnwrap.item.Item item) { return new yarnwrap.util.Identifier(wrapperContained.getId(item.wrapperContained)); }
public yarnwrap.data.client.TextureMap cross(yarnwrap.block.Block block) { return new yarnwrap.data.client.TextureMap(wrapperContained.cross(block.wrapperContained)); }
public yarnwrap.data.client.TextureMap frontSideWithCustomBottom(yarnwrap.block.Block block,yarnwrap.block.Block bottom) { return new yarnwrap.data.client.TextureMap(wrapperContained.frontSideWithCustomBottom(block.wrapperContained,bottom.wrapperContained)); }
public yarnwrap.data.client.TextureMap copyAndAdd(yarnwrap.data.client.TextureKey key,yarnwrap.util.Identifier id) { return new yarnwrap.data.client.TextureMap(wrapperContained.copyAndAdd(key.wrapperContained,id.wrapperContained)); }
public yarnwrap.data.client.TextureMap cross(yarnwrap.util.Identifier id) { return new yarnwrap.data.client.TextureMap(wrapperContained.cross(id.wrapperContained)); }
public yarnwrap.data.client.TextureMap plant(yarnwrap.block.Block block) { return new yarnwrap.data.client.TextureMap(wrapperContained.plant(block.wrapperContained)); }
public yarnwrap.data.client.TextureMap frontTopSide(yarnwrap.block.Block frontTopSideBlock,yarnwrap.block.Block downBlock) { return new yarnwrap.data.client.TextureMap(wrapperContained.frontTopSide(frontTopSideBlock.wrapperContained,downBlock.wrapperContained)); }
public yarnwrap.data.client.TextureMap of(yarnwrap.data.client.TextureKey key,yarnwrap.util.Identifier id) { return new yarnwrap.data.client.TextureMap(wrapperContained.of(key.wrapperContained,id.wrapperContained)); }
public yarnwrap.data.client.TextureMap plant(yarnwrap.util.Identifier id) { return new yarnwrap.data.client.TextureMap(wrapperContained.plant(id.wrapperContained)); }
public yarnwrap.data.client.TextureMap rail(yarnwrap.block.Block block) { return new yarnwrap.data.client.TextureMap(wrapperContained.rail(block.wrapperContained)); }
public yarnwrap.data.client.TextureMap rail(yarnwrap.util.Identifier id) { return new yarnwrap.data.client.TextureMap(wrapperContained.rail(id.wrapperContained)); }
public yarnwrap.data.client.TextureMap wool(yarnwrap.block.Block block) { return new yarnwrap.data.client.TextureMap(wrapperContained.wool(block.wrapperContained)); }
public yarnwrap.data.client.TextureMap stem(yarnwrap.block.Block block) { return new yarnwrap.data.client.TextureMap(wrapperContained.stem(block.wrapperContained)); }
public yarnwrap.data.client.TextureMap crop(yarnwrap.util.Identifier id) { return new yarnwrap.data.client.TextureMap(wrapperContained.crop(id.wrapperContained)); }
public yarnwrap.data.client.TextureMap pattern(yarnwrap.block.Block block) { return new yarnwrap.data.client.TextureMap(wrapperContained.pattern(block.wrapperContained)); }
public yarnwrap.data.client.TextureMap particle(yarnwrap.util.Identifier id) { return new yarnwrap.data.client.TextureMap(wrapperContained.particle(id.wrapperContained)); }
public yarnwrap.data.client.TextureMap fan(yarnwrap.block.Block block) { return new yarnwrap.data.client.TextureMap(wrapperContained.fan(block.wrapperContained)); }
public yarnwrap.data.client.TextureMap torch(yarnwrap.util.Identifier id) { return new yarnwrap.data.client.TextureMap(wrapperContained.torch(id.wrapperContained)); }
public yarnwrap.data.client.TextureMap sideEnd(yarnwrap.block.Block block) { return new yarnwrap.data.client.TextureMap(wrapperContained.sideEnd(block.wrapperContained)); }
public yarnwrap.data.client.TextureMap layer0(yarnwrap.util.Identifier id) { return new yarnwrap.data.client.TextureMap(wrapperContained.layer0(id.wrapperContained)); }
public yarnwrap.data.client.TextureMap sideAndTop(yarnwrap.block.Block block) { return new yarnwrap.data.client.TextureMap(wrapperContained.sideAndTop(block.wrapperContained)); }
public yarnwrap.data.client.TextureMap sideAndEndForTop(yarnwrap.block.Block block) { return new yarnwrap.data.client.TextureMap(wrapperContained.sideAndEndForTop(block.wrapperContained)); }
public yarnwrap.data.client.TextureMap sideTopBottom(yarnwrap.block.Block block) { return new yarnwrap.data.client.TextureMap(wrapperContained.sideTopBottom(block.wrapperContained)); }
public yarnwrap.data.client.TextureMap wallSideTopBottom(yarnwrap.block.Block block) { return new yarnwrap.data.client.TextureMap(wrapperContained.wallSideTopBottom(block.wrapperContained)); }
public yarnwrap.data.client.TextureMap topBottom(yarnwrap.block.Block block) { return new yarnwrap.data.client.TextureMap(wrapperContained.topBottom(block.wrapperContained)); }
public yarnwrap.data.client.TextureMap particle(yarnwrap.block.Block block) { return new yarnwrap.data.client.TextureMap(wrapperContained.particle(block.wrapperContained)); }
public yarnwrap.data.client.TextureMap fire0(yarnwrap.block.Block block) { return new yarnwrap.data.client.TextureMap(wrapperContained.fire0(block.wrapperContained)); }
public yarnwrap.data.client.TextureMap fire1(yarnwrap.block.Block block) { return new yarnwrap.data.client.TextureMap(wrapperContained.fire1(block.wrapperContained)); }
public yarnwrap.data.client.TextureMap lantern(yarnwrap.block.Block block) { return new yarnwrap.data.client.TextureMap(wrapperContained.lantern(block.wrapperContained)); }
public yarnwrap.data.client.TextureMap torch(yarnwrap.block.Block block) { return new yarnwrap.data.client.TextureMap(wrapperContained.torch(block.wrapperContained)); }
public yarnwrap.data.client.TextureMap sideFrontBack(yarnwrap.block.Block block) { return new yarnwrap.data.client.TextureMap(wrapperContained.sideFrontBack(block.wrapperContained)); }
public yarnwrap.data.client.TextureMap sideFrontTopBottom(yarnwrap.block.Block block) { return new yarnwrap.data.client.TextureMap(wrapperContained.sideFrontTopBottom(block.wrapperContained)); }
public yarnwrap.data.client.TextureMap sideFrontTop(yarnwrap.block.Block block) { return new yarnwrap.data.client.TextureMap(wrapperContained.sideFrontTop(block.wrapperContained)); }
public yarnwrap.data.client.TextureMap sideFrontEnd(yarnwrap.block.Block block) { return new yarnwrap.data.client.TextureMap(wrapperContained.sideFrontEnd(block.wrapperContained)); }
public yarnwrap.data.client.TextureMap top(yarnwrap.block.Block top) { return new yarnwrap.data.client.TextureMap(wrapperContained.top(top.wrapperContained)); }
public yarnwrap.data.client.TextureMap layer0(yarnwrap.block.Block block) { return new yarnwrap.data.client.TextureMap(wrapperContained.layer0(block.wrapperContained)); }
public yarnwrap.data.client.TextureMap campfire(yarnwrap.block.Block block) { return new yarnwrap.data.client.TextureMap(wrapperContained.campfire(block.wrapperContained)); }
public yarnwrap.data.client.TextureMap wallSideEnd(yarnwrap.block.Block block) { return new yarnwrap.data.client.TextureMap(wrapperContained.wallSideEnd(block.wrapperContained)); }
public yarnwrap.data.client.TextureMap candleCake(yarnwrap.block.Block block,boolean lit) { return new yarnwrap.data.client.TextureMap(wrapperContained.candleCake(block.wrapperContained,lit)); }
public yarnwrap.data.client.TextureMap cauldron(yarnwrap.util.Identifier content) { return new yarnwrap.data.client.TextureMap(wrapperContained.cauldron(content.wrapperContained)); }
public yarnwrap.data.client.TextureMap copy(yarnwrap.data.client.TextureKey parent,yarnwrap.data.client.TextureKey child) { return new yarnwrap.data.client.TextureMap(wrapperContained.copy(parent.wrapperContained,child.wrapperContained)); }
public yarnwrap.data.client.TextureMap register(yarnwrap.data.client.TextureKey key,yarnwrap.util.Identifier id) { return new yarnwrap.data.client.TextureMap(wrapperContained.register(key.wrapperContained,id.wrapperContained)); }
public yarnwrap.data.client.TextureMap topBottom(yarnwrap.util.Identifier top,yarnwrap.util.Identifier bottom) { return new yarnwrap.data.client.TextureMap(wrapperContained.topBottom(top.wrapperContained,bottom.wrapperContained)); }
public yarnwrap.data.client.TextureMap wool(yarnwrap.util.Identifier id) { return new yarnwrap.data.client.TextureMap(wrapperContained.wool(id.wrapperContained)); }
public yarnwrap.data.client.TextureMap sculkShrieker(boolean canSummon) { return new yarnwrap.data.client.TextureMap(wrapperContained.sculkShrieker(canSummon)); }
// public java.lang.String method_46198(java.lang.String path) { return wrapperContained.method_46198(path); }
// public java.lang.String method_46199(java.lang.String path) { return wrapperContained.method_46199(path); }
public yarnwrap.data.client.TextureMap textureSideTop(yarnwrap.block.Block block) { return new yarnwrap.data.client.TextureMap(wrapperContained.textureSideTop(block.wrapperContained)); }
public yarnwrap.data.client.TextureMap textureParticle(yarnwrap.block.Block block) { return new yarnwrap.data.client.TextureMap(wrapperContained.textureParticle(block.wrapperContained)); }
public yarnwrap.data.client.TextureMap layered(yarnwrap.util.Identifier layer0,yarnwrap.util.Identifier layer1) { return new yarnwrap.data.client.TextureMap(wrapperContained.layered(layer0.wrapperContained,layer1.wrapperContained)); }
public yarnwrap.data.client.TextureMap layered(yarnwrap.util.Identifier layer0,yarnwrap.util.Identifier layer1,yarnwrap.util.Identifier layer2) { return new yarnwrap.data.client.TextureMap(wrapperContained.layered(layer0.wrapperContained,layer1.wrapperContained,layer2.wrapperContained)); }
public yarnwrap.data.client.TextureMap flowerbed(yarnwrap.block.Block block) { return new yarnwrap.data.client.TextureMap(wrapperContained.flowerbed(block.wrapperContained)); }
public yarnwrap.data.client.TextureMap snifferEgg(java.lang.String age) { return new yarnwrap.data.client.TextureMap(wrapperContained.snifferEgg(age)); }
public yarnwrap.data.client.TextureMap pottedAzaleaBush(yarnwrap.block.Block block) { return new yarnwrap.data.client.TextureMap(wrapperContained.pottedAzaleaBush(block.wrapperContained)); }
public yarnwrap.data.client.TextureMap trialSpawner(yarnwrap.block.Block block,java.lang.String side,java.lang.String top) { return new yarnwrap.data.client.TextureMap(wrapperContained.trialSpawner(block.wrapperContained,side,top)); }
public yarnwrap.data.client.TextureMap vault(yarnwrap.block.Block block,java.lang.String front,java.lang.String side,java.lang.String top,java.lang.String bottom) { return new yarnwrap.data.client.TextureMap(wrapperContained.vault(block.wrapperContained,front,side,top,bottom)); }

}
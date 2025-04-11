package yarnwrap.data.client;
public class BlockStateModelGenerator { public net.minecraft.data.client.BlockStateModelGenerator wrapperContained; public BlockStateModelGenerator(net.minecraft.data.client.BlockStateModelGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Consumer blockStateCollector() { return wrapperContained.blockStateCollector; }
// public void blockStateCollector(java.util.function.Consumer value) { wrapperContained.blockStateCollector = value; }
// public java.util.function.BiConsumer modelCollector() { return wrapperContained.modelCollector; }
// public void modelCollector(java.util.function.BiConsumer value) { wrapperContained.modelCollector = value; }
// public java.util.function.Consumer simpleItemModelExemptionCollector() { return wrapperContained.simpleItemModelExemptionCollector; }
// public void simpleItemModelExemptionCollector(java.util.function.Consumer value) { wrapperContained.simpleItemModelExemptionCollector = value; }
public java.util.List CONNECTION_VARIANT_FUNCTIONS() { return wrapperContained.CONNECTION_VARIANT_FUNCTIONS; }
// public void CONNECTION_VARIANT_FUNCTIONS(java.util.List value) { wrapperContained.CONNECTION_VARIANT_FUNCTIONS = value; }
// public java.util.List nonOrientableTrapdoors() { return wrapperContained.nonOrientableTrapdoors; }
// public void nonOrientableTrapdoors(java.util.List value) { wrapperContained.nonOrientableTrapdoors = value; }
// public java.util.Map texturedModels() { return wrapperContained.texturedModels; }
// public void texturedModels(java.util.Map value) { wrapperContained.texturedModels = value; }
// public java.util.Map VARIANT_POOL_FUNCTIONS() { return wrapperContained.VARIANT_POOL_FUNCTIONS; }
// public void VARIANT_POOL_FUNCTIONS(java.util.Map value) { wrapperContained.VARIANT_POOL_FUNCTIONS = value; }
// public java.util.Map stoneStateFactories() { return wrapperContained.stoneStateFactories; }
// public void stoneStateFactories(java.util.Map value) { wrapperContained.stoneStateFactories = value; }
// public java.util.Map CHISELED_BOOKSHELF_MODEL_CACHE() { return wrapperContained.CHISELED_BOOKSHELF_MODEL_CACHE; }
// public void CHISELED_BOOKSHELF_MODEL_CACHE(java.util.Map value) { wrapperContained.CHISELED_BOOKSHELF_MODEL_CACHE = value; }
public BlockStateModelGenerator(java.util.function.Consumer blockStateCollector,java.util.function.BiConsumer modelCollector,java.util.function.Consumer simpleItemModelExemptionCollector) { this.wrapperContained = new net.minecraft.data.client.BlockStateModelGenerator(blockStateCollector,modelCollector,simpleItemModelExemptionCollector); }
// public void registerChorusPlant() { wrapperContained.registerChorusPlant(); }
// public void registerComposter() { wrapperContained.registerComposter(); }
// public void registerDaylightDetector() { wrapperContained.registerDaylightDetector(); }
// public void registerFarmland() { wrapperContained.registerFarmland(); }
// public void registerFire() { wrapperContained.registerFire(); }
// public void registerSoulFire() { wrapperContained.registerSoulFire(); }
// public void registerFrostedIce() { wrapperContained.registerFrostedIce(); }
// public void registerTopSoils() { wrapperContained.registerTopSoils(); }
// public void registerCocoa() { wrapperContained.registerCocoa(); }
// public void registerDirtPath() { wrapperContained.registerDirtPath(); }
// public void registerHopper() { wrapperContained.registerHopper(); }
// public void registerIronBars() { wrapperContained.registerIronBars(); }
// public void registerLever() { wrapperContained.registerLever(); }
// public void registerLilyPad() { wrapperContained.registerLilyPad(); }
// public void registerNetherPortal() { wrapperContained.registerNetherPortal(); }
// public void registerNetherrack() { wrapperContained.registerNetherrack(); }
// public void registerObserver() { wrapperContained.registerObserver(); }
// public void registerPistons() { wrapperContained.registerPistons(); }
// public void registerPistonHead() { wrapperContained.registerPistonHead(); }
// public void registerScaffolding() { wrapperContained.registerScaffolding(); }
// public void registerRedstoneLamp() { wrapperContained.registerRedstoneLamp(); }
// public void registerRedstoneTorch() { wrapperContained.registerRedstoneTorch(); }
// public void registerRepeater() { wrapperContained.registerRepeater(); }
// public void registerSeaPickle() { wrapperContained.registerSeaPickle(); }
// public void registerSnows() { wrapperContained.registerSnows(); }
public void register() { wrapperContained.register(); }
// public java.util.List getBambooBlockStateVariants(int age) { return wrapperContained.getBambooBlockStateVariants(age); }
// public yarnwrap.util.Identifier getTurtleEggModel(int eggs,java.lang.String prefix,yarnwrap.data.client.TextureMap textures) { return new yarnwrap.util.Identifier(wrapperContained.getTurtleEggModel(eggs,prefix,textures.wrapperContained)); }
// public void registerItemModel(yarnwrap.item.Item item) { wrapperContained.registerItemModel(item.wrapperContained); }
// public void registerParentedItemModel(yarnwrap.item.Item item,yarnwrap.util.Identifier parentModelId) { wrapperContained.registerParentedItemModel(item.wrapperContained,parentModelId.wrapperContained); }
// public void excludeFromSimpleItemModelGeneration(yarnwrap.block.Block block) { wrapperContained.excludeFromSimpleItemModelGeneration(block.wrapperContained); }
// public void registerBuiltinWithParticle(yarnwrap.block.Block block,yarnwrap.item.Item particleSource) { wrapperContained.registerBuiltinWithParticle(block.wrapperContained,particleSource.wrapperContained); }
// public void registerStateWithModelReference(yarnwrap.block.Block block,yarnwrap.block.Block modelReference) { wrapperContained.registerStateWithModelReference(block.wrapperContained,modelReference.wrapperContained); }
// public void registerCoral(yarnwrap.block.Block coral,yarnwrap.block.Block deadCoral,yarnwrap.block.Block coralBlock,yarnwrap.block.Block deadCoralBlock,yarnwrap.block.Block coralFan,yarnwrap.block.Block deadCoralFan,yarnwrap.block.Block coralWallFan,yarnwrap.block.Block deadCoralWallFan) { wrapperContained.registerCoral(coral.wrapperContained,deadCoral.wrapperContained,coralBlock.wrapperContained,deadCoralBlock.wrapperContained,coralFan.wrapperContained,deadCoralFan.wrapperContained,coralWallFan.wrapperContained,deadCoralWallFan.wrapperContained); }
// public void registerFlowerPotPlant(yarnwrap.block.Block plantBlock,yarnwrap.block.Block flowerPotBlock,Object tintType) { wrapperContained.registerFlowerPotPlant(plantBlock.wrapperContained,flowerPotBlock.wrapperContained,tintType); }
// public void registerCubeWithCustomTextures(yarnwrap.block.Block block,yarnwrap.block.Block otherTextureSource,java.util.function.BiFunction texturesFactory) { wrapperContained.registerCubeWithCustomTextures(block.wrapperContained,otherTextureSource.wrapperContained,texturesFactory); }
// public void registerCrop(yarnwrap.block.Block crop,yarnwrap.state.property.Property ageProperty,int ageTextureIndices) { wrapperContained.registerCrop(crop.wrapperContained,ageProperty.wrapperContained,ageTextureIndices); }
// public void registerTintableCross(yarnwrap.block.Block block,Object tintType) { wrapperContained.registerTintableCross(block.wrapperContained,tintType); }
// public void registerTintableCross(yarnwrap.block.Block block,Object tintType,yarnwrap.data.client.TextureMap texture) { wrapperContained.registerTintableCross(block.wrapperContained,tintType,texture.wrapperContained); }
// public void registerNorthDefaultHorizontalRotatable(yarnwrap.block.Block block,yarnwrap.data.client.TextureMap texture) { wrapperContained.registerNorthDefaultHorizontalRotatable(block.wrapperContained,texture.wrapperContained); }
// public void registerAxisRotated(yarnwrap.block.Block block,Object modelFactory) { wrapperContained.registerAxisRotated(block.wrapperContained,modelFactory); }
// public void registerAxisRotated(yarnwrap.block.Block block,Object verticalModelFactory,Object horizontalModelFactory) { wrapperContained.registerAxisRotated(block.wrapperContained,verticalModelFactory,horizontalModelFactory); }
// public void registerItemModel(yarnwrap.block.Block block,java.lang.String textureSuffix) { wrapperContained.registerItemModel(block.wrapperContained,textureSuffix); }
// public yarnwrap.util.Identifier createSubModel(yarnwrap.block.Block block,java.lang.String suffix,yarnwrap.data.client.Model model,java.util.function.Function texturesFactory) { return new yarnwrap.util.Identifier(wrapperContained.createSubModel(block.wrapperContained,suffix,model.wrapperContained,texturesFactory)); }
// public void registerBeehive(yarnwrap.block.Block beehive,java.util.function.Function texturesFactory) { wrapperContained.registerBeehive(beehive.wrapperContained,texturesFactory); }
// public void registerTopSoil(yarnwrap.block.Block topSoil,yarnwrap.util.Identifier modelId,yarnwrap.data.client.BlockStateVariant snowyVariant) { wrapperContained.registerTopSoil(topSoil.wrapperContained,modelId.wrapperContained,snowyVariant.wrapperContained); }
// public void registerPiston(yarnwrap.block.Block piston,yarnwrap.util.Identifier extendedModelId,yarnwrap.data.client.TextureMap textures) { wrapperContained.registerPiston(piston.wrapperContained,extendedModelId.wrapperContained,textures.wrapperContained); }
// public yarnwrap.data.client.BlockStateVariantMap createBooleanModelMap(yarnwrap.state.property.BooleanProperty property,yarnwrap.util.Identifier trueModel,yarnwrap.util.Identifier falseModel) { return new yarnwrap.data.client.BlockStateVariantMap(wrapperContained.createBooleanModelMap(property.wrapperContained,trueModel.wrapperContained,falseModel.wrapperContained)); }
// public yarnwrap.data.client.BlockStateVariantMap createValueFencedModelMap(yarnwrap.state.property.Property property,java.lang.Comparable fence,yarnwrap.util.Identifier higherOrEqualModelId,yarnwrap.util.Identifier lowerModelId) { return new yarnwrap.data.client.BlockStateVariantMap(wrapperContained.createValueFencedModelMap(property.wrapperContained,fence,higherOrEqualModelId.wrapperContained,lowerModelId.wrapperContained)); }
// public Object fillDoorVariantMap(Object variantMap,yarnwrap.block.enums.DoubleBlockHalf targetHalf,yarnwrap.util.Identifier leftHingeClosedModelId,yarnwrap.util.Identifier leftHingeOpenModelId,yarnwrap.util.Identifier rightHingeClosedModelId,yarnwrap.util.Identifier rightHingeOpenModelId) { return wrapperContained.fillDoorVariantMap(variantMap,targetHalf.wrapperContained,leftHingeClosedModelId.wrapperContained,leftHingeOpenModelId.wrapperContained,rightHingeClosedModelId.wrapperContained,rightHingeOpenModelId.wrapperContained); }
// public void registerRandomHorizontalRotations(Object modelFactory,net.minecraft.block.Block[] blocks) { wrapperContained.registerRandomHorizontalRotations(modelFactory,blocks); }
// public yarnwrap.util.Identifier getTurtleEggModel(java.lang.Integer eggs,java.lang.Integer hatch) { return new yarnwrap.util.Identifier(wrapperContained.getTurtleEggModel(eggs,hatch)); }
// public java.util.List buildBlockStateVariants(java.util.List modelIds,java.util.function.UnaryOperator processor) { return wrapperContained.buildBlockStateVariants(modelIds,processor); }
// public net.minecraft.data.client.BlockStateVariant[] createModelVariantWithRandomHorizontalRotations(yarnwrap.util.Identifier modelId) { return wrapperContained.createModelVariantWithRandomHorizontalRotations(modelId.wrapperContained); }
// public Object registerBuiltin(yarnwrap.util.Identifier modelId,yarnwrap.block.Block particleBlock) { return wrapperContained.registerBuiltin(modelId.wrapperContained,particleBlock.wrapperContained); }
// public void registerStonecutter() { wrapperContained.registerStonecutter(); }
// public void registerStructureBlock() { wrapperContained.registerStructureBlock(); }
// public void registerSweetBerryBush() { wrapperContained.registerSweetBerryBush(); }
// public void registerTripwire() { wrapperContained.registerTripwire(); }
// public void registerTripwireHook() { wrapperContained.registerTripwireHook(); }
// public void registerTurtleEgg() { wrapperContained.registerTurtleEgg(); }
// public void registerMagmaBlock() { wrapperContained.registerMagmaBlock(); }
// public void registerInfestedStone() { wrapperContained.registerInfestedStone(); }
// public yarnwrap.data.client.BlockStateVariantMap createNorthDefaultHorizontalRotationStates() { return new yarnwrap.data.client.BlockStateVariantMap(wrapperContained.createNorthDefaultHorizontalRotationStates()); }
// public void registerItemModel(yarnwrap.block.Block block) { wrapperContained.registerItemModel(block.wrapperContained); }
// public void registerCoralFan(yarnwrap.block.Block coralFanBlock,yarnwrap.block.Block coralWallFanBlock) { wrapperContained.registerCoralFan(coralFanBlock.wrapperContained,coralWallFanBlock.wrapperContained); }
// public void registerPlantPart(yarnwrap.block.Block plant,yarnwrap.block.Block plantStem,Object tintType) { wrapperContained.registerPlantPart(plant.wrapperContained,plantStem.wrapperContained,tintType); }
// public void registerTintableCrossBlockState(yarnwrap.block.Block block,Object tintType) { wrapperContained.registerTintableCrossBlockState(block.wrapperContained,tintType); }
// public void registerTintableCrossBlockState(yarnwrap.block.Block block,Object tintType,yarnwrap.data.client.TextureMap crossTexture) { wrapperContained.registerTintableCrossBlockState(block.wrapperContained,tintType,crossTexture.wrapperContained); }
// public void registerNorthDefaultHorizontalRotated(yarnwrap.block.Block block,Object modelFactory) { wrapperContained.registerNorthDefaultHorizontalRotated(block.wrapperContained,modelFactory); }
// public yarnwrap.data.client.BlockStateSupplier createDoorBlockState(yarnwrap.block.Block doorBlock,yarnwrap.util.Identifier bottomLeftHingeClosedModelId,yarnwrap.util.Identifier bottomLeftHingeOpenModelId,yarnwrap.util.Identifier bottomRightHingeClosedModelId,yarnwrap.util.Identifier bottomRightHingeOpenModelId,yarnwrap.util.Identifier topLeftHingeClosedModelId,yarnwrap.util.Identifier topLeftHingeOpenModelId,yarnwrap.util.Identifier topRightHingeClosedModelId,yarnwrap.util.Identifier topRightHingeOpenModelId) { return new yarnwrap.data.client.BlockStateSupplier(wrapperContained.createDoorBlockState(doorBlock.wrapperContained,bottomLeftHingeClosedModelId.wrapperContained,bottomLeftHingeOpenModelId.wrapperContained,bottomRightHingeClosedModelId.wrapperContained,bottomRightHingeOpenModelId.wrapperContained,topLeftHingeClosedModelId.wrapperContained,topLeftHingeOpenModelId.wrapperContained,topRightHingeClosedModelId.wrapperContained,topRightHingeOpenModelId.wrapperContained)); }
// public void registerSouthDefaultHorizontalFacing(Object modelFactory,net.minecraft.block.Block[] blocks) { wrapperContained.registerSouthDefaultHorizontalFacing(modelFactory,blocks); }
// public yarnwrap.data.client.BlockStateVariantMap createSouthDefaultHorizontalRotationStates() { return new yarnwrap.data.client.BlockStateVariantMap(wrapperContained.createSouthDefaultHorizontalRotationStates()); }
// public void registerMirrorable(yarnwrap.block.Block block) { wrapperContained.registerMirrorable(block.wrapperContained); }
// public void registerGourd(yarnwrap.block.Block stemBlock,yarnwrap.block.Block attachedStemBlock) { wrapperContained.registerGourd(stemBlock.wrapperContained,attachedStemBlock.wrapperContained); }
// public void registerDoubleBlock(yarnwrap.block.Block doubleBlock,Object tintType) { wrapperContained.registerDoubleBlock(doubleBlock.wrapperContained,tintType); }
// public void registerSingleton(yarnwrap.block.Block block,Object modelFactory) { wrapperContained.registerSingleton(block.wrapperContained,modelFactory); }
// public void registerParentedItemModel(yarnwrap.block.Block block,yarnwrap.util.Identifier parentModelId) { wrapperContained.registerParentedItemModel(block.wrapperContained,parentModelId.wrapperContained); }
// public yarnwrap.data.client.BlockStateSupplier createFenceGateBlockState(yarnwrap.block.Block fenceGateBlock,yarnwrap.util.Identifier openModelId,yarnwrap.util.Identifier closedModelId,yarnwrap.util.Identifier openWallModelId,yarnwrap.util.Identifier closedWallModelId,boolean uvlock) { return new yarnwrap.data.client.BlockStateSupplier(wrapperContained.createFenceGateBlockState(fenceGateBlock.wrapperContained,openModelId.wrapperContained,closedModelId.wrapperContained,openWallModelId.wrapperContained,closedWallModelId.wrapperContained,uvlock)); }
// public yarnwrap.data.client.BlockStateVariantMap createEastDefaultHorizontalRotationStates() { return new yarnwrap.data.client.BlockStateVariantMap(wrapperContained.createEastDefaultHorizontalRotationStates()); }
// public void registerRotatable(yarnwrap.block.Block block) { wrapperContained.registerRotatable(block.wrapperContained); }
// public Object registerBuiltin(yarnwrap.block.Block block,yarnwrap.block.Block particleBlock) { return wrapperContained.registerBuiltin(block.wrapperContained,particleBlock.wrapperContained); }
// public yarnwrap.data.client.VariantsBlockStateSupplier createBlockStateWithRandomHorizontalRotations(yarnwrap.block.Block block,yarnwrap.util.Identifier modelId) { return new yarnwrap.data.client.VariantsBlockStateSupplier(wrapperContained.createBlockStateWithRandomHorizontalRotations(block.wrapperContained,modelId.wrapperContained)); }
// public yarnwrap.data.client.BlockStateSupplier createWallBlockState(yarnwrap.block.Block wallBlock,yarnwrap.util.Identifier postModelId,yarnwrap.util.Identifier lowSideModelId,yarnwrap.util.Identifier tallSideModelId) { return new yarnwrap.data.client.BlockStateSupplier(wrapperContained.createWallBlockState(wallBlock.wrapperContained,postModelId.wrapperContained,lowSideModelId.wrapperContained,tallSideModelId.wrapperContained)); }
// public yarnwrap.data.client.BlockStateVariantMap createNorthDefaultRotationStates() { return new yarnwrap.data.client.BlockStateVariantMap(wrapperContained.createNorthDefaultRotationStates()); }
public void registerSimpleCubeAll(yarnwrap.block.Block block) { wrapperContained.registerSimpleCubeAll(block.wrapperContained); }
// public void registerWoolAndCarpet(yarnwrap.block.Block wool,yarnwrap.block.Block carpet) { wrapperContained.registerWoolAndCarpet(wool.wrapperContained,carpet.wrapperContained); }
// public yarnwrap.data.client.VariantsBlockStateSupplier createSingletonBlockState(yarnwrap.block.Block block,yarnwrap.util.Identifier modelId) { return new yarnwrap.data.client.VariantsBlockStateSupplier(wrapperContained.createSingletonBlockState(block.wrapperContained,modelId.wrapperContained)); }
// public yarnwrap.data.client.VariantsBlockStateSupplier createBlockStateWithTwoModelAndRandomInversion(yarnwrap.block.Block block,yarnwrap.util.Identifier firstModelId,yarnwrap.util.Identifier secondModelId) { return new yarnwrap.data.client.VariantsBlockStateSupplier(wrapperContained.createBlockStateWithTwoModelAndRandomInversion(block.wrapperContained,firstModelId.wrapperContained,secondModelId.wrapperContained)); }
// public yarnwrap.data.client.BlockStateSupplier createStairsBlockState(yarnwrap.block.Block stairsBlock,yarnwrap.util.Identifier innerModelId,yarnwrap.util.Identifier regularModelId,yarnwrap.util.Identifier outerModelId) { return new yarnwrap.data.client.BlockStateSupplier(wrapperContained.createStairsBlockState(stairsBlock.wrapperContained,innerModelId.wrapperContained,regularModelId.wrapperContained,outerModelId.wrapperContained)); }
// public yarnwrap.data.client.BlockStateVariantMap createAxisRotatedVariantMap() { return new yarnwrap.data.client.BlockStateVariantMap(wrapperContained.createAxisRotatedVariantMap()); }
// public Object registerCubeAllModelTexturePool(yarnwrap.block.Block block) { return wrapperContained.registerCubeAllModelTexturePool(block.wrapperContained); }
// public void registerGlassPane(yarnwrap.block.Block glass,yarnwrap.block.Block glassPane) { wrapperContained.registerGlassPane(glass.wrapperContained,glassPane.wrapperContained); }
// public void registerCooker(yarnwrap.block.Block cooker,Object modelFactory) { wrapperContained.registerCooker(cooker.wrapperContained,modelFactory); }
// public yarnwrap.data.client.BlockStateSupplier createAxisRotatedBlockState(yarnwrap.block.Block block,yarnwrap.util.Identifier modelId) { return new yarnwrap.data.client.BlockStateSupplier(wrapperContained.createAxisRotatedBlockState(block.wrapperContained,modelId.wrapperContained)); }
// public yarnwrap.data.client.BlockStateSupplier createButtonBlockState(yarnwrap.block.Block buttonBlock,yarnwrap.util.Identifier regularModelId,yarnwrap.util.Identifier pressedModelId) { return new yarnwrap.data.client.BlockStateSupplier(wrapperContained.createButtonBlockState(buttonBlock.wrapperContained,regularModelId.wrapperContained,pressedModelId.wrapperContained)); }
// public yarnwrap.data.client.BlockStateSupplier createOrientableTrapdoorBlockState(yarnwrap.block.Block trapdoorBlock,yarnwrap.util.Identifier topModelId,yarnwrap.util.Identifier bottomModelId,yarnwrap.util.Identifier openModelId) { return new yarnwrap.data.client.BlockStateSupplier(wrapperContained.createOrientableTrapdoorBlockState(trapdoorBlock.wrapperContained,topModelId.wrapperContained,bottomModelId.wrapperContained,openModelId.wrapperContained)); }
// public void registerSunflower() { wrapperContained.registerSunflower(); }
// public void registerDoor(yarnwrap.block.Block doorBlock) { wrapperContained.registerDoor(doorBlock.wrapperContained); }
// public void registerBuiltinWithParticle(yarnwrap.block.Block block,yarnwrap.util.Identifier particleSource) { wrapperContained.registerBuiltinWithParticle(block.wrapperContained,particleSource.wrapperContained); }
// public yarnwrap.data.client.BlockStateSupplier createFenceBlockState(yarnwrap.block.Block fenceBlock,yarnwrap.util.Identifier postModelId,yarnwrap.util.Identifier sideModelId) { return new yarnwrap.data.client.BlockStateSupplier(wrapperContained.createFenceBlockState(fenceBlock.wrapperContained,postModelId.wrapperContained,sideModelId.wrapperContained)); }
// public yarnwrap.data.client.BlockStateSupplier createTrapdoorBlockState(yarnwrap.block.Block trapdoorBlock,yarnwrap.util.Identifier topModelId,yarnwrap.util.Identifier bottomModelId,yarnwrap.util.Identifier openModelId) { return new yarnwrap.data.client.BlockStateSupplier(wrapperContained.createTrapdoorBlockState(trapdoorBlock.wrapperContained,topModelId.wrapperContained,bottomModelId.wrapperContained,openModelId.wrapperContained)); }
// public void registerTallSeagrass() { wrapperContained.registerTallSeagrass(); }
// public void registerOrientableTrapdoor(yarnwrap.block.Block trapdoorBlock) { wrapperContained.registerOrientableTrapdoor(trapdoorBlock.wrapperContained); }
// public void registerWeightedPressurePlate(yarnwrap.block.Block weightedPressurePlate,yarnwrap.block.Block textureSource) { wrapperContained.registerWeightedPressurePlate(weightedPressurePlate.wrapperContained,textureSource.wrapperContained); }
// public yarnwrap.data.client.BlockStateSupplier createAxisRotatedBlockState(yarnwrap.block.Block block,yarnwrap.util.Identifier verticalModelId,yarnwrap.util.Identifier horizontalModelId) { return new yarnwrap.data.client.BlockStateSupplier(wrapperContained.createAxisRotatedBlockState(block.wrapperContained,verticalModelId.wrapperContained,horizontalModelId.wrapperContained)); }
// public yarnwrap.data.client.BlockStateSupplier createSlabBlockState(yarnwrap.block.Block slabBlock,yarnwrap.util.Identifier bottomModelId,yarnwrap.util.Identifier topModelId,yarnwrap.util.Identifier fullModelId) { return new yarnwrap.data.client.BlockStateSupplier(wrapperContained.createSlabBlockState(slabBlock.wrapperContained,bottomModelId.wrapperContained,topModelId.wrapperContained,fullModelId.wrapperContained)); }
// public void registerBamboo() { wrapperContained.registerBamboo(); }
// public void registerTrapdoor(yarnwrap.block.Block trapdoorBlock) { wrapperContained.registerTrapdoor(trapdoorBlock.wrapperContained); }
// public void registerParented(yarnwrap.block.Block modelSource,yarnwrap.block.Block child) { wrapperContained.registerParented(modelSource.wrapperContained,child.wrapperContained); }
// public yarnwrap.data.client.BlockStateSupplier createPressurePlateBlockState(yarnwrap.block.Block pressurePlateBlock,yarnwrap.util.Identifier upModelId,yarnwrap.util.Identifier downModelId) { return new yarnwrap.data.client.BlockStateSupplier(wrapperContained.createPressurePlateBlockState(pressurePlateBlock.wrapperContained,upModelId.wrapperContained,downModelId.wrapperContained)); }
// public yarnwrap.data.client.BlockStateVariantMap createUpDefaultFacingVariantMap() { return new yarnwrap.data.client.BlockStateVariantMap(wrapperContained.createUpDefaultFacingVariantMap()); }
// public Object registerLog(yarnwrap.block.Block logBlock) { return wrapperContained.registerLog(logBlock.wrapperContained); }
// public void registerTorch(yarnwrap.block.Block torch,yarnwrap.block.Block wallTorch) { wrapperContained.registerTorch(torch.wrapperContained,wallTorch.wrapperContained); }
// public void registerDoubleBlock(yarnwrap.block.Block block,yarnwrap.util.Identifier upperHalfModelId,yarnwrap.util.Identifier lowerHalfModelId) { wrapperContained.registerDoubleBlock(block.wrapperContained,upperHalfModelId.wrapperContained,lowerHalfModelId.wrapperContained); }
// public void registerBarrel() { wrapperContained.registerBarrel(); }
// public void registerSimpleState(yarnwrap.block.Block block) { wrapperContained.registerSimpleState(block.wrapperContained); }
// public void registerBed(yarnwrap.block.Block bed,yarnwrap.block.Block particleSource) { wrapperContained.registerBed(bed.wrapperContained,particleSource.wrapperContained); }
// public void registerBell() { wrapperContained.registerBell(); }
// public void registerTurnableRail(yarnwrap.block.Block rail) { wrapperContained.registerTurnableRail(rail.wrapperContained); }
// public void registerRoots(yarnwrap.block.Block root,yarnwrap.block.Block pottedRoot) { wrapperContained.registerRoots(root.wrapperContained,pottedRoot.wrapperContained); }
// public void registerGrindstone() { wrapperContained.registerGrindstone(); }
// public void registerStraightRail(yarnwrap.block.Block rail) { wrapperContained.registerStraightRail(rail.wrapperContained); }
// public void registerCommandBlock(yarnwrap.block.Block commandBlock) { wrapperContained.registerCommandBlock(commandBlock.wrapperContained); }
// public void registerBookshelf() { wrapperContained.registerBookshelf(); }
// public void registerAnvil(yarnwrap.block.Block anvil) { wrapperContained.registerAnvil(anvil.wrapperContained); }
// public void registerRedstone() { wrapperContained.registerRedstone(); }
// public void registerMushroomBlock(yarnwrap.block.Block mushroomBlock) { wrapperContained.registerMushroomBlock(mushroomBlock.wrapperContained); }
// public void registerComparator() { wrapperContained.registerComparator(); }
// public void registerDispenserLikeOrientable(yarnwrap.block.Block block) { wrapperContained.registerDispenserLikeOrientable(block.wrapperContained); }
// public void registerSmoothStone() { wrapperContained.registerSmoothStone(); }
// public void registerNetherrackBottomCustomTop(yarnwrap.block.Block block) { wrapperContained.registerNetherrackBottomCustomTop(block.wrapperContained); }
// public void registerBrewingStand() { wrapperContained.registerBrewingStand(); }
// public java.util.List getFireFloorModels(yarnwrap.block.Block texture) { return wrapperContained.getFireFloorModels(texture.wrapperContained); }
// public void registerCake() { wrapperContained.registerCake(); }
// public java.util.List getFireSideModels(yarnwrap.block.Block texture) { return wrapperContained.getFireSideModels(texture.wrapperContained); }
// public void registerCartographyTable() { wrapperContained.registerCartographyTable(); }
// public java.util.List getFireUpModels(yarnwrap.block.Block texture) { return wrapperContained.getFireUpModels(texture.wrapperContained); }
// public void registerSmithingTable() { wrapperContained.registerSmithingTable(); }
// public void registerLantern(yarnwrap.block.Block lantern) { wrapperContained.registerLantern(lantern.wrapperContained); }
// public void registerPumpkins() { wrapperContained.registerPumpkins(); }
// public void registerNorthDefaultHorizontalRotation(yarnwrap.block.Block block) { wrapperContained.registerNorthDefaultHorizontalRotation(block.wrapperContained); }
// public void registerCauldrons() { wrapperContained.registerCauldrons(); }
// public void registerShulkerBox(yarnwrap.block.Block shulkerBox) { wrapperContained.registerShulkerBox(shulkerBox.wrapperContained); }
// public void registerChorusFlower() { wrapperContained.registerChorusFlower(); }
// public void registerEndPortalFrame() { wrapperContained.registerEndPortalFrame(); }
// public void registerRespawnAnchor() { wrapperContained.registerRespawnAnchor(); }
// public yarnwrap.data.client.BlockStateVariant addJigsawOrientationToVariant(yarnwrap.block.enums.Orientation orientation,yarnwrap.data.client.BlockStateVariant variant) { return new yarnwrap.data.client.BlockStateVariant(wrapperContained.addJigsawOrientationToVariant(orientation.wrapperContained,variant.wrapperContained)); }
// public void registerJigsaw() { wrapperContained.registerJigsaw(); }
// public void registerCampfire(net.minecraft.block.Block[] blocks) { wrapperContained.registerCampfire(blocks); }
// public void registerAxisRotated(yarnwrap.block.Block block,yarnwrap.util.Identifier modelId) { wrapperContained.registerAxisRotated(block.wrapperContained,modelId.wrapperContained); }
// public void registerRod(yarnwrap.block.Block block) { wrapperContained.registerRod(block.wrapperContained); }
// public void registerAmethysts() { wrapperContained.registerAmethysts(); }
// public void registerCandle(yarnwrap.block.Block candle,yarnwrap.block.Block cake) { wrapperContained.registerCandle(candle.wrapperContained,cake.wrapperContained); }
// public void registerAmethyst(yarnwrap.block.Block block) { wrapperContained.registerAmethyst(block.wrapperContained); }
// public void registerPointedDripstone() { wrapperContained.registerPointedDripstone(); }
// public yarnwrap.data.client.BlockStateVariant getDripstoneVariant(yarnwrap.util.math.Direction direction,yarnwrap.block.enums.Thickness thickness) { return new yarnwrap.data.client.BlockStateVariant(wrapperContained.getDripstoneVariant(direction.wrapperContained,thickness.wrapperContained)); }
// public void registerSculkSensor() { wrapperContained.registerSculkSensor(); }
// public void registerPetrifiedOakSlab() { wrapperContained.registerPetrifiedOakSlab(); }
// public void method_33509(yarnwrap.data.client.TextureMap textureMap) { wrapperContained.method_33509(textureMap.wrapperContained); }
// public void method_33512(yarnwrap.data.client.TextureMap textureMap) { wrapperContained.method_33512(textureMap.wrapperContained); }
// public void registerWallPlant(yarnwrap.block.Block block) { wrapperContained.registerWallPlant(block.wrapperContained); }
// public void registerCaveVines() { wrapperContained.registerCaveVines(); }
// public void registerBigDripleaf() { wrapperContained.registerBigDripleaf(); }
// public void registerSmallDripleaf() { wrapperContained.registerSmallDripleaf(); }
// public void registerAzalea(yarnwrap.block.Block block) { wrapperContained.registerAzalea(block.wrapperContained); }
// public void method_34603(yarnwrap.item.SpawnEggItem item) { wrapperContained.method_34603(item.wrapperContained); }
// public void method_34605(yarnwrap.block.Block property) { wrapperContained.method_34605(property.wrapperContained); }
// public yarnwrap.data.client.BlockStateVariant method_34606(yarnwrap.block.Block age) { return new yarnwrap.data.client.BlockStateVariant(wrapperContained.method_34606(age.wrapperContained)); }
// public yarnwrap.data.client.BlockStateSupplier createStoneState(yarnwrap.block.Block block,yarnwrap.util.Identifier modelId,yarnwrap.data.client.TextureMap textures,java.util.function.BiConsumer modelCollector) { return new yarnwrap.data.client.BlockStateSupplier(wrapperContained.createStoneState(block.wrapperContained,modelId.wrapperContained,textures.wrapperContained,modelCollector)); }
// public yarnwrap.data.client.BlockStateVariant method_34610(yarnwrap.block.enums.StructureBlockMode mode) { return new yarnwrap.data.client.BlockStateVariant(wrapperContained.method_34610(mode.wrapperContained)); }
// public void method_34612(yarnwrap.data.family.BlockFamily family) { wrapperContained.method_34612(family.wrapperContained); }
// public yarnwrap.data.client.BlockStateVariant method_34618(java.lang.Integer stage) { return new yarnwrap.data.client.BlockStateVariant(wrapperContained.method_34618(stage)); }
// public yarnwrap.data.client.BlockStateVariant method_34619(java.lang.Integer tick,java.lang.Boolean locked,java.lang.Boolean on) { return new yarnwrap.data.client.BlockStateVariant(wrapperContained.method_34619(tick,locked,on)); }
// public void method_34623(yarnwrap.data.client.TextureMap textures) { wrapperContained.method_34623(textures.wrapperContained); }
// public yarnwrap.data.client.TextureMap method_34624(yarnwrap.data.client.TextureMap id) { return new yarnwrap.data.client.TextureMap(wrapperContained.method_34624(id.wrapperContained)); }
// public yarnwrap.data.client.BlockStateVariant method_34625(yarnwrap.util.Identifier height) { return new yarnwrap.data.client.BlockStateVariant(wrapperContained.method_34625(height.wrapperContained)); }
// public void method_34626(yarnwrap.util.Identifier textures) { wrapperContained.method_34626(textures.wrapperContained); }
// public yarnwrap.data.client.BlockStateVariant method_34627(yarnwrap.util.Identifier phase) { return new yarnwrap.data.client.BlockStateVariant(wrapperContained.method_34627(phase.wrapperContained)); }
// public yarnwrap.data.client.BlockStateVariant method_34628(yarnwrap.util.Identifier on,yarnwrap.util.Identifier shape) { return new yarnwrap.data.client.BlockStateVariant(wrapperContained.method_34628(on.wrapperContained,shape.wrapperContained)); }
// public yarnwrap.data.client.BlockStateVariant method_34629(int age) { return new yarnwrap.data.client.BlockStateVariant(wrapperContained.method_34629(age)); }
// public yarnwrap.data.client.BlockStateVariant method_34630(net.minecraft.util.Identifier[] charges) { return new yarnwrap.data.client.BlockStateVariant(wrapperContained.method_34630(charges)); }
// public yarnwrap.data.client.BlockStateSupplier createDeepslateState(yarnwrap.block.Block block,yarnwrap.util.Identifier modelId,yarnwrap.data.client.TextureMap textures,java.util.function.BiConsumer modelCollector) { return new yarnwrap.data.client.BlockStateSupplier(wrapperContained.createDeepslateState(block.wrapperContained,modelId.wrapperContained,textures.wrapperContained,modelCollector)); }
// public void method_34636(yarnwrap.data.client.TextureMap textures) { wrapperContained.method_34636(textures.wrapperContained); }
// public yarnwrap.data.client.TextureMap method_34637(yarnwrap.data.client.TextureMap id) { return new yarnwrap.data.client.TextureMap(wrapperContained.method_34637(id.wrapperContained)); }
// public void method_34639(yarnwrap.util.Identifier textures) { wrapperContained.method_34639(textures.wrapperContained); }
// public void method_34643(yarnwrap.data.client.TextureMap textureMap) { wrapperContained.method_34643(textureMap.wrapperContained); }
// public void method_34645(yarnwrap.util.Identifier textures) { wrapperContained.method_34645(textures.wrapperContained); }
// public yarnwrap.data.client.BlockStateVariant method_34657(yarnwrap.util.Identifier modelId) { return new yarnwrap.data.client.BlockStateVariant(wrapperContained.method_34657(modelId.wrapperContained)); }
// public void registerLightningRod() { wrapperContained.registerLightningRod(); }
// public void registerSingleton(yarnwrap.block.Block block,yarnwrap.data.client.TextureMap textures,yarnwrap.data.client.Model model) { wrapperContained.registerSingleton(block.wrapperContained,textures.wrapperContained,model.wrapperContained); }
// public void registerInfestedDeepslate() { wrapperContained.registerInfestedDeepslate(); }
// public void registerPottedAzaleaBush(yarnwrap.block.Block block) { wrapperContained.registerPottedAzaleaBush(block.wrapperContained); }
// public void registerLightBlock() { wrapperContained.registerLightBlock(); }
// public void registerMuddyMangroveRoots() { wrapperContained.registerMuddyMangroveRoots(); }
// public void registerMangrovePropagule() { wrapperContained.registerMangrovePropagule(); }
// public void registerFrogspawn() { wrapperContained.registerFrogspawn(); }
// public yarnwrap.data.client.BlockStateVariant method_42036(yarnwrap.util.Identifier bloom) { return new yarnwrap.data.client.BlockStateVariant(wrapperContained.method_42036(bloom.wrapperContained)); }
// public void registerSculkShrieker() { wrapperContained.registerSculkShrieker(); }
// public void registerSculkCatalyst() { wrapperContained.registerSculkCatalyst(); }
// public yarnwrap.data.client.BlockStateSupplier createMudBrickState(yarnwrap.block.Block block,yarnwrap.util.Identifier modelId,yarnwrap.data.client.TextureMap textures,java.util.function.BiConsumer modelCollector) { return new yarnwrap.data.client.BlockStateSupplier(wrapperContained.createMudBrickState(block.wrapperContained,modelId.wrapperContained,textures.wrapperContained,modelCollector)); }
// public yarnwrap.data.client.BlockStateVariant method_43818(yarnwrap.util.Identifier model) { return new yarnwrap.data.client.BlockStateVariant(wrapperContained.method_43818(model.wrapperContained)); }
// public yarnwrap.data.client.BlockStateVariant method_43819(yarnwrap.util.Identifier model) { return new yarnwrap.data.client.BlockStateVariant(wrapperContained.method_43819(model.wrapperContained)); }
// public yarnwrap.data.client.BlockStateVariant method_43820(yarnwrap.util.Identifier model) { return new yarnwrap.data.client.BlockStateVariant(wrapperContained.method_43820(model.wrapperContained)); }
// public yarnwrap.data.client.BlockStateVariant method_43821(yarnwrap.util.Identifier model) { return new yarnwrap.data.client.BlockStateVariant(wrapperContained.method_43821(model.wrapperContained)); }
// public yarnwrap.data.client.BlockStateVariant method_43822(yarnwrap.util.Identifier model) { return new yarnwrap.data.client.BlockStateVariant(wrapperContained.method_43822(model.wrapperContained)); }
// public yarnwrap.data.client.BlockStateVariant method_43823(yarnwrap.util.Identifier model) { return new yarnwrap.data.client.BlockStateVariant(wrapperContained.method_43823(model.wrapperContained)); }
// public yarnwrap.data.client.BlockStateSupplier createCustomFenceBlockState(yarnwrap.block.Block customFenceBlock,yarnwrap.util.Identifier postModelId,yarnwrap.util.Identifier northModelId,yarnwrap.util.Identifier eastModelId,yarnwrap.util.Identifier southModelId,yarnwrap.util.Identifier westModelId) { return new yarnwrap.data.client.BlockStateSupplier(wrapperContained.createCustomFenceBlockState(customFenceBlock.wrapperContained,postModelId.wrapperContained,northModelId.wrapperContained,eastModelId.wrapperContained,southModelId.wrapperContained,westModelId.wrapperContained)); }
public void registerHangingSign(yarnwrap.block.Block strippedLog,yarnwrap.block.Block hangingSign,yarnwrap.block.Block wallHangingSign) { wrapperContained.registerHangingSign(strippedLog.wrapperContained,hangingSign.wrapperContained,wallHangingSign.wrapperContained); }
// public void registerChiseledBookshelf() { wrapperContained.registerChiseledBookshelf(); }
// public yarnwrap.data.client.BlockStateSupplier createUvLockedColumnBlockState(yarnwrap.block.Block block,yarnwrap.data.client.TextureMap textureMap,java.util.function.BiConsumer modelCollector) { return new yarnwrap.data.client.BlockStateSupplier(wrapperContained.createUvLockedColumnBlockState(block.wrapperContained,textureMap.wrapperContained,modelCollector)); }
// public void method_47811(yarnwrap.data.client.MultipartBlockStateSupplier pair) { wrapperContained.method_47811(pair.wrapperContained); }
// public void supplyChiseledBookshelfModels(yarnwrap.data.client.MultipartBlockStateSupplier blockStateSupplier,Object facingCondition,Object rotation) { wrapperContained.supplyChiseledBookshelfModels(blockStateSupplier.wrapperContained,facingCondition,rotation); }
// public void method_47813(yarnwrap.data.client.MultipartBlockStateSupplier pair) { wrapperContained.method_47813(pair.wrapperContained); }
// public void supplyChiseledBookshelfModel(yarnwrap.data.client.MultipartBlockStateSupplier blockStateSupplier,Object facingCondition,Object rotation,yarnwrap.state.property.BooleanProperty property,yarnwrap.data.client.Model model,boolean occupied) { wrapperContained.supplyChiseledBookshelfModel(blockStateSupplier.wrapperContained,facingCondition,rotation,property.wrapperContained,model.wrapperContained,occupied); }
// public yarnwrap.util.Identifier method_47815(yarnwrap.data.client.Model key) { return new yarnwrap.util.Identifier(wrapperContained.method_47815(key.wrapperContained)); }
// public void registerTintableCrossBlockStateWithStages(yarnwrap.block.Block block,Object tintType,yarnwrap.state.property.Property stageProperty,int stages) { wrapperContained.registerTintableCrossBlockStateWithStages(block.wrapperContained,tintType,stageProperty.wrapperContained,stages); }
// public yarnwrap.data.client.BlockStateVariant method_49375(int stage) { return new yarnwrap.data.client.BlockStateVariant(wrapperContained.method_49375(stage)); }
// public yarnwrap.data.client.BlockStateVariant method_49376(yarnwrap.block.Block dusted) { return new yarnwrap.data.client.BlockStateVariant(wrapperContained.method_49376(dusted.wrapperContained)); }
// public void registerBrushableBlock(yarnwrap.block.Block block) { wrapperContained.registerBrushableBlock(block.wrapperContained); }
// public void registerFlowerbed(yarnwrap.block.Block flowerbed) { wrapperContained.registerFlowerbed(flowerbed.wrapperContained); }
// public yarnwrap.data.client.BlockStateVariant method_49985(yarnwrap.util.Identifier phase) { return new yarnwrap.data.client.BlockStateVariant(wrapperContained.method_49985(phase.wrapperContained)); }
// public yarnwrap.data.client.BlockStateVariant method_49986(yarnwrap.block.Block age,java.lang.Integer half) { return new yarnwrap.data.client.BlockStateVariant(wrapperContained.method_49986(age.wrapperContained,half)); }
// public yarnwrap.util.Identifier method_49987(java.lang.Integer hatch) { return new yarnwrap.util.Identifier(wrapperContained.method_49987(hatch)); }
// public yarnwrap.data.client.BlockStateVariant method_49988(java.util.function.Function hatch) { return new yarnwrap.data.client.BlockStateVariant(wrapperContained.method_49988(hatch)); }
// public void registerCalibratedSculkSensor() { wrapperContained.registerCalibratedSculkSensor(); }
// public void registerSnifferEgg() { wrapperContained.registerSnifferEgg(); }
// public void registerPitcherPlant() { wrapperContained.registerPitcherPlant(); }
// public void registerPitcherCrop() { wrapperContained.registerPitcherCrop(); }
public void registerGeneric(yarnwrap.block.Block block) { wrapperContained.registerGeneric(block.wrapperContained); }
// public void registerCrafter() { wrapperContained.registerCrafter(); }
// public yarnwrap.data.client.BlockStateVariant method_54655(yarnwrap.block.enums.Orientation orientation) { return new yarnwrap.data.client.BlockStateVariant(wrapperContained.method_54655(orientation.wrapperContained)); }
// public yarnwrap.data.client.BlockStateVariant method_54821(yarnwrap.util.Identifier lit,yarnwrap.util.Identifier powered) { return new yarnwrap.data.client.BlockStateVariant(wrapperContained.method_54821(lit.wrapperContained,powered.wrapperContained)); }
// public yarnwrap.data.client.BlockStateSupplier createCopperBulbBlockState(yarnwrap.block.Block copperBulbBlock,yarnwrap.util.Identifier modelId,yarnwrap.util.Identifier litModelId,yarnwrap.util.Identifier poweredModelId,yarnwrap.util.Identifier litPoweredModelId) { return new yarnwrap.data.client.BlockStateSupplier(wrapperContained.createCopperBulbBlockState(copperBulbBlock.wrapperContained,modelId.wrapperContained,litModelId.wrapperContained,poweredModelId.wrapperContained,litPoweredModelId.wrapperContained)); }
// public void registerParentedDoor(yarnwrap.block.Block parent,yarnwrap.block.Block doorBlock) { wrapperContained.registerParentedDoor(parent.wrapperContained,doorBlock.wrapperContained); }
// public void registerParentedTrapdoor(yarnwrap.block.Block parent,yarnwrap.block.Block trapdoorBlock) { wrapperContained.registerParentedTrapdoor(parent.wrapperContained,trapdoorBlock.wrapperContained); }
// public void registerWaxedCopperBulb(yarnwrap.block.Block unwaxedCopperBulbBlock,yarnwrap.block.Block waxedCopperBulbBlock) { wrapperContained.registerWaxedCopperBulb(unwaxedCopperBulbBlock.wrapperContained,waxedCopperBulbBlock.wrapperContained); }
// public void registerCopperBulb(yarnwrap.block.Block copperBulbBlock) { wrapperContained.registerCopperBulb(copperBulbBlock.wrapperContained); }
// public yarnwrap.data.client.BlockStateVariant method_55305(yarnwrap.util.Identifier spawnerState,yarnwrap.util.Identifier ominous) { return new yarnwrap.data.client.BlockStateVariant(wrapperContained.method_55305(spawnerState.wrapperContained,ominous.wrapperContained)); }
// public void registerTrialSpawner() { wrapperContained.registerTrialSpawner(); }
// public yarnwrap.data.client.BlockStateVariant method_56885(yarnwrap.util.Identifier vaultState,yarnwrap.util.Identifier ominous) { return new yarnwrap.data.client.BlockStateVariant(wrapperContained.method_56885(vaultState.wrapperContained,ominous.wrapperContained)); }
// public void registerVault() { wrapperContained.registerVault(); }

}
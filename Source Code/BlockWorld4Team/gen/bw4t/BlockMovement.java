package bw4t;
/**
 * GENERATED CODE - DO NOT CHANGE
 */

import astra.core.*;
import astra.execution.*;
import astra.event.*;
import astra.messaging.*;
import astra.formula.*;
import astra.lang.*;
import astra.statement.*;
import astra.term.*;
import astra.type.*;
import astra.tr.*;
import astra.reasoner.util.*;


public class BlockMovement extends ASTRAClass {
	public BlockMovement() {
		setParents(new Class[] {astra.lang.Agent.class});
		addRule(new Rule(
			"bw4t.BlockMovement", new int[] {44,13,44,22},
			new GoalEvent('+',
				new Goal(
					new Predicate("init", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"bw4t.BlockMovement", new int[] {44,21,59,9},
				new Statement[] {
					new ModuleCall("environment",
						"bw4t.BlockMovement", new int[] {45,12,45,62},
						new Predicate("launch", new Term[] {
							Primitive.newPrimitive("bw4t"),
							Primitive.newPrimitive("bw4t-client-3.8.6.jar")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("bw4t.BlockMovement","environment")).launch(
									(java.lang.String) intention.evaluate(predicate.getTerm(0)),
									(java.lang.String) intention.evaluate(predicate.getTerm(1))
								);
							}
						}
					),
					new ModuleCall("environment",
						"bw4t.BlockMovement", new int[] {51,12,51,47},
						new Predicate("init", new Term[] {
							new ListTerm(new Term[] {
								new Funct("agentcount", new Term[] {
									Primitive.newPrimitive("1")
								})
							})
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("bw4t.BlockMovement","environment")).init(
									(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("environment",
						"bw4t.BlockMovement", new int[] {55,12,55,50},
						new Predicate("init", new Term[] {
							new ListTerm(new Term[] {
								new Funct("launchgui", new Term[] {
									Primitive.newPrimitive("false")
								})
							})
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("bw4t.BlockMovement","environment")).init(
									(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("environment",
						"bw4t.BlockMovement", new int[] {56,12,56,30},
						new Predicate("join", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("bw4t.BlockMovement","environment")).join(
								);
							}
						}
					),
					new ModuleCall("environment",
						"bw4t.BlockMovement", new int[] {57,12,57,34},
						new Predicate("startEnv", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("bw4t.BlockMovement","environment")).startEnv(
								);
							}
						}
					),
					new Subgoal(
						"bw4t.BlockMovement", new int[] {58,12,59,9},
						new Goal(
							new Predicate("agentGenerate", new Term[] {})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.BlockMovement", new int[] {67,13,67,31},
			new GoalEvent('+',
				new Goal(
					new Predicate("agentGenerate", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"bw4t.BlockMovement", new int[] {67,30,99,9},
				new Statement[] {
					new Declaration(
						new Variable(Type.LIST, "entities"),
						"bw4t.BlockMovement", new int[] {68,12,99,9},
						new ModuleTerm("environment", Type.LIST,
							new Predicate("freeEntities", new Term[] {}),
							new ModuleTermAdaptor() {
								public Object invoke(Intention intention, Predicate predicate) {
									return ((astra.lang.EIS) intention.getModule("bw4t.BlockMovement","environment")).freeEntities(
									);
								}
								public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("bw4t.BlockMovement","environment")).freeEntities(
									);
								}
							}
						)
					),
					new Declaration(
						new Variable(Type.INTEGER, "i"),
						"bw4t.BlockMovement", new int[] {69,12,99,9},
						Primitive.newPrimitive(0)
					),
					new While(
						"bw4t.BlockMovement", new int[] {73,12,99,9},
						new Comparison("<",
							new Variable(Type.INTEGER, "i"),
							new ModuleTerm("listOperation", Type.INTEGER,
								new Predicate("size", new Term[] {
									new Variable(Type.LIST, "entities")
								}),
								new ModuleTermAdaptor() {
									public Object invoke(Intention intention, Predicate predicate) {
										return ((astra.lang.Prelude) intention.getModule("bw4t.BlockMovement","listOperation")).size(
											(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
										);
									}
									public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
										return ((astra.lang.Prelude) visitor.agent().getModule("bw4t.BlockMovement","listOperation")).size(
											(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
										);
									}
								}
							)
						),
						new Block(
							"bw4t.BlockMovement", new int[] {73,53,80,14},
							new Statement[] {
								new Declaration(
									new Variable(Type.STRING, "entity"),
									"bw4t.BlockMovement", new int[] {74,16,80,14},
									new ModuleTerm("listOperation", Type.STRING,
										new Predicate("valueAsString", new Term[] {
											new Variable(Type.LIST, "entities"),
											new Variable(Type.INTEGER, "i")
										}),
										new ModuleTermAdaptor() {
											public Object invoke(Intention intention, Predicate predicate) {
												return ((astra.lang.Prelude) intention.getModule("bw4t.BlockMovement","listOperation")).valueAsString(
													(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
													(java.lang.Integer) intention.evaluate(predicate.getTerm(1))
												);
											}
											public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
												return ((astra.lang.Prelude) visitor.agent().getModule("bw4t.BlockMovement","listOperation")).valueAsString(
													(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0)),
													(java.lang.Integer) visitor.evaluate(predicate.getTerm(1))
												);
											}
										}
									)
								),
								new Declaration(
									new Variable(Type.STRING, "type"),
									"bw4t.BlockMovement", new int[] {75,16,80,14},
									new ModuleTerm("environment", Type.STRING,
										new Predicate("getEntityType", new Term[] {
											new Variable(Type.STRING, "entity")
										}),
										new ModuleTermAdaptor() {
											public Object invoke(Intention intention, Predicate predicate) {
												return ((astra.lang.EIS) intention.getModule("bw4t.BlockMovement","environment")).getEntityType(
													(java.lang.String) intention.evaluate(predicate.getTerm(0))
												);
											}
											public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
												return ((astra.lang.EIS) visitor.agent().getModule("bw4t.BlockMovement","environment")).getEntityType(
													(java.lang.String) visitor.evaluate(predicate.getTerm(0))
												);
											}
										}
									)
								),
								new If(
									"bw4t.BlockMovement", new int[] {76,16,80,14},
									new AND(
										new Comparison("==",
											new Variable(Type.STRING, "type"),
											Primitive.newPrimitive("bot")
										),
										new NOT(
											new BracketFormula(
												new Comparison("==",
													new Variable(Type.STRING, "entity"),
													Primitive.newPrimitive("Bot_1")
												)
											)
										)
									),
									new Block(
										"bw4t.BlockMovement", new int[] {76,55,78,18},
										new Statement[] {
											new ModuleCall("system",
												"bw4t.BlockMovement", new int[] {77,20,77,63},
												new Predicate("createAgent", new Term[] {
													new Variable(Type.STRING, "entity"),
													Primitive.newPrimitive("bw4t.ChildBots")
												}),
												new DefaultModuleCallAdaptor() {
													public boolean inline() {
														return false;
													}

													public boolean invoke(Intention intention, Predicate predicate) {
														return ((astra.lang.System) intention.getModule("bw4t.BlockMovement","system")).createAgent(
															(java.lang.String) intention.evaluate(predicate.getTerm(0)),
															(java.lang.String) intention.evaluate(predicate.getTerm(1))
														);
													}
												}
											)
										}
									)
								),
								new Assignment(
									new Variable(Type.INTEGER, "i"),
									"bw4t.BlockMovement", new int[] {79,17,80,14},
									Operator.newOperator('+',
										new Variable(Type.INTEGER, "i"),
										Primitive.newPrimitive(1)
									)
								)
							}
						)
					),
					new ModuleCall("environment",
						"bw4t.BlockMovement", new int[] {81,13,81,38},
						new Predicate("link", new Term[] {
							Primitive.newPrimitive("Bot_1")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("bw4t.BlockMovement","environment")).link(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Query(
						"bw4t.BlockMovement", new int[] {83,13,83,42},
						new Predicate("agents", new Term[] {
							new Variable(Type.LIST, "agentList",false)
						})
					),
					new Query(
						"bw4t.BlockMovement", new int[] {84,13,84,48},
						new Predicate("sequence", new Term[] {
							new Variable(Type.LIST, "colorSequence",false)
						})
					),
					new If(
						"bw4t.BlockMovement", new int[] {86,14,99,9},
						new Comparison("==",
							new ModuleTerm("listOperation", Type.INTEGER,
								new Predicate("size", new Term[] {
									new Variable(Type.LIST, "agentList")
								}),
								new ModuleTermAdaptor() {
									public Object invoke(Intention intention, Predicate predicate) {
										return ((astra.lang.Prelude) intention.getModule("bw4t.BlockMovement","listOperation")).size(
											(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
										);
									}
									public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
										return ((astra.lang.Prelude) visitor.agent().getModule("bw4t.BlockMovement","listOperation")).size(
											(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
										);
									}
								}
							),
							Primitive.newPrimitive(0)
						),
						new Block(
							"bw4t.BlockMovement", new int[] {86,49,90,15},
							new Statement[] {
								new Subgoal(
									"bw4t.BlockMovement", new int[] {87,18,90,15},
									new Goal(
										new Predicate("singleRobotMovement", new Term[] {
											new Variable(Type.LIST, "colorSequence")
										})
									)
								),
								new ModuleCall("console",
									"bw4t.BlockMovement", new int[] {88,18,88,70},
									new Predicate("println", new Term[] {
										Primitive.newPrimitive("Block World Task Completed  !!!! ")
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return false;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Console) intention.getModule("bw4t.BlockMovement","console")).println(
												(java.lang.String) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								),
								new ModuleCall("system",
									"bw4t.BlockMovement", new int[] {89,18,89,31},
									new Predicate("exit", new Term[] {}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return false;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.System) intention.getModule("bw4t.BlockMovement","system")).exit(
											);
										}
									}
								)
							}
						)
					),
					new If(
						"bw4t.BlockMovement", new int[] {92,14,99,9},
						new Comparison(">",
							new ModuleTerm("listOperation", Type.INTEGER,
								new Predicate("size", new Term[] {
									new Variable(Type.LIST, "agentList")
								}),
								new ModuleTermAdaptor() {
									public Object invoke(Intention intention, Predicate predicate) {
										return ((astra.lang.Prelude) intention.getModule("bw4t.BlockMovement","listOperation")).size(
											(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
										);
									}
									public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
										return ((astra.lang.Prelude) visitor.agent().getModule("bw4t.BlockMovement","listOperation")).size(
											(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
										);
									}
								}
							),
							Primitive.newPrimitive(0)
						),
						new Block(
							"bw4t.BlockMovement", new int[] {92,48,97,15},
							new Statement[] {
								new Declaration(
									new Variable(Type.INTEGER, "agentCount"),
									"bw4t.BlockMovement", new int[] {93,18,97,15},
									new ModuleTerm("listOperation", Type.INTEGER,
										new Predicate("size", new Term[] {
											new Variable(Type.LIST, "agentList")
										}),
										new ModuleTermAdaptor() {
											public Object invoke(Intention intention, Predicate predicate) {
												return ((astra.lang.Prelude) intention.getModule("bw4t.BlockMovement","listOperation")).size(
													(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
												);
											}
											public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
												return ((astra.lang.Prelude) visitor.agent().getModule("bw4t.BlockMovement","listOperation")).size(
													(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
												);
											}
										}
									)
								),
								new Subgoal(
									"bw4t.BlockMovement", new int[] {94,18,97,15},
									new Goal(
										new Predicate("multipleRobotsMovement", new Term[] {
											new Variable(Type.LIST, "colorSequence"),
											new Variable(Type.INTEGER, "agentCount")
										})
									)
								),
								new ModuleCall("console",
									"bw4t.BlockMovement", new int[] {95,18,95,70},
									new Predicate("println", new Term[] {
										Primitive.newPrimitive("Block World Task Completed  !!!! ")
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return false;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Console) intention.getModule("bw4t.BlockMovement","console")).println(
												(java.lang.String) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								),
								new ModuleCall("system",
									"bw4t.BlockMovement", new int[] {96,18,96,31},
									new Predicate("exit", new Term[] {}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return false;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.System) intention.getModule("bw4t.BlockMovement","system")).exit(
											);
										}
									}
								)
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.BlockMovement", new int[] {108,13,108,56},
			new GoalEvent('+',
				new Goal(
					new Predicate("singleRobotMovement", new Term[] {
						new Variable(Type.LIST, "colorsSequence",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"bw4t.BlockMovement", new int[] {108,55,125,9},
				new Statement[] {
					new Query(
						"bw4t.BlockMovement", new int[] {109,12,109,39},
						new Predicate("getRooms", new Term[] {
							new Variable(Type.LIST, "rooms",false)
						})
					),
					new ForAll(
						"bw4t.BlockMovement", new int[] {110,12,110,51},
						new Variable(Type.STRING, "seqColr",false),
						new Variable(Type.LIST, "colorsSequence"),
						new Block(
							"bw4t.BlockMovement", new int[] {110,51,125,9},
							new Statement[] {
								new BeliefUpdate('-',
									"bw4t.BlockMovement", new int[] {111,16,124,13},
									new Predicate("colorFound", new Term[] {
										Primitive.newPrimitive(true)
									})
								),
								new BeliefUpdate('+',
									"bw4t.BlockMovement", new int[] {112,16,124,13},
									new Predicate("colorFound", new Term[] {
										Primitive.newPrimitive(false)
									})
								),
								new ModuleCall("console",
									"bw4t.BlockMovement", new int[] {113,16,113,95},
									new Predicate("println", new Term[] {
										Operator.newOperator('+',
											Primitive.newPrimitive("Next color for which the block is to be found ::: "),
											new Variable(Type.STRING, "seqColr")
										)
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return false;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Console) intention.getModule("bw4t.BlockMovement","console")).println(
												(java.lang.String) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								),
								new ForAll(
									"bw4t.BlockMovement", new int[] {114,16,114,42},
									new Variable(Type.STRING, "room",false),
									new Variable(Type.LIST, "rooms"),
									new Block(
										"bw4t.BlockMovement", new int[] {114,42,124,13},
										new Statement[] {
											new If(
												"bw4t.BlockMovement", new int[] {115,20,123,17},
												new Predicate("colorFound", new Term[] {
													Primitive.newPrimitive(false)
												}),
												new Block(
													"bw4t.BlockMovement", new int[] {115,41,122,21},
													new Statement[] {
														new If(
															"bw4t.BlockMovement", new int[] {116,24,122,21},
															new AND(
																new Predicate("roomVisited", new Term[] {
																	new Variable(Type.STRING, "room"),
																	Primitive.newPrimitive(true)
																}),
																new Predicate("roomColor", new Term[] {
																	new Variable(Type.STRING, "room"),
																	new Variable(Type.STRING, "seqColr")
																})
															),
															new Block(
																"bw4t.BlockMovement", new int[] {116,76,118,25},
																new Statement[] {
																	new Subgoal(
																		"bw4t.BlockMovement", new int[] {117,28,118,25},
																		new Goal(
																			new Predicate("robotGoingToRoom", new Term[] {
																				new Variable(Type.STRING, "room"),
																				new Variable(Type.STRING, "seqColr"),
																				new Variable(Type.LIST, "colorsSequence")
																			})
																		)
																	)
																}
															),
															new If(
																"bw4t.BlockMovement", new int[] {118,30,122,21},
																new NOT(
																	new Predicate("roomVisited", new Term[] {
																		new Variable(Type.STRING, "room"),
																		Primitive.newPrimitive(true)
																	})
																),
																new Block(
																	"bw4t.BlockMovement", new int[] {118,57,121,25},
																	new Statement[] {
																		new BeliefUpdate('+',
																			"bw4t.BlockMovement", new int[] {119,28,121,25},
																			new Predicate("roomVisited", new Term[] {
																				new Variable(Type.STRING, "room"),
																				Primitive.newPrimitive(true)
																			})
																		),
																		new Subgoal(
																			"bw4t.BlockMovement", new int[] {120,28,121,25},
																			new Goal(
																				new Predicate("robotGoingToRoom", new Term[] {
																					new Variable(Type.STRING, "room"),
																					new Variable(Type.STRING, "seqColr"),
																					new Variable(Type.LIST, "colorsSequence")
																				})
																			)
																		)
																	}
																)
															)
														)
													}
												)
											)
										}
									)
								)
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.BlockMovement", new int[] {132,13,132,87},
			new GoalEvent('+',
				new Goal(
					new Predicate("robotGoingToRoom", new Term[] {
						new Variable(Type.STRING, "room",false),
						new Variable(Type.STRING, "currentColor",false),
						new Variable(Type.LIST, "colorsSequence",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"bw4t.BlockMovement", new int[] {132,86,164,9},
				new Statement[] {
					new If(
						"bw4t.BlockMovement", new int[] {133,12,164,9},
						new Predicate("colorFound", new Term[] {
							Primitive.newPrimitive(false)
						}),
						new Block(
							"bw4t.BlockMovement", new int[] {133,33,163,13},
							new Statement[] {
								new ModuleCall("environment",
									"bw4t.BlockMovement", new int[] {134,16,134,38},
									new Predicate("goTo", new Term[] {
										new Variable(Type.STRING, "room")
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return true;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.EIS) intention.getModule("bw4t.BlockMovement","environment")).auto_action(intention,evaluate(intention,predicate));
										}
									}
								),
								new Wait(
									"bw4t.BlockMovement", new int[] {135,16,163,13},
									new ModuleFormula("environment",
										new Predicate("at", new Term[] {
											new Variable(Type.STRING, "room")
										}),
										new ModuleFormulaAdaptor() {
											public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
												return ((astra.lang.EIS) visitor.agent().getModule("bw4t.BlockMovement","environment")).auto_formula((Predicate) predicate.accept(visitor));
											}
										}
									)
								),
								new Declaration(
									new Variable(Type.INTEGER, "match"),
									"bw4t.BlockMovement", new int[] {136,16,163,13},
									Primitive.newPrimitive(0)
								),
								new ForEach(
									"bw4t.BlockMovement", new int[] {137,16,163,13},
									new ModuleFormula("environment",
										new Predicate("color", new Term[] {
											new Variable(Type.LONG, "colorId",false),
											new Variable(Type.STRING, "color",false)
										}),
										new ModuleFormulaAdaptor() {
											public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
												return ((astra.lang.EIS) visitor.agent().getModule("bw4t.BlockMovement","environment")).auto_formula((Predicate) predicate.accept(visitor));
											}
										}
									),
									new Block(
										"bw4t.BlockMovement", new int[] {137,72,158,17},
										new Statement[] {
											new BeliefUpdate('+',
												"bw4t.BlockMovement", new int[] {138,20,158,17},
												new Predicate("roomColor", new Term[] {
													new Variable(Type.STRING, "room"),
													new Variable(Type.STRING, "color")
												})
											),
											new If(
												"bw4t.BlockMovement", new int[] {139,20,158,17},
												new Comparison("==",
													new Variable(Type.STRING, "color"),
													new Variable(Type.STRING, "currentColor")
												),
												new Block(
													"bw4t.BlockMovement", new int[] {139,43,141,21},
													new Statement[] {
														new Assignment(
															new Variable(Type.INTEGER, "match"),
															"bw4t.BlockMovement", new int[] {140,24,141,21},
															Operator.newOperator('+',
																new Variable(Type.INTEGER, "match"),
																Primitive.newPrimitive(1)
															)
														)
													}
												)
											),
											new If(
												"bw4t.BlockMovement", new int[] {142,20,158,17},
												new AND(
													new Comparison("==",
														new Variable(Type.STRING, "color"),
														new Variable(Type.STRING, "currentColor")
													),
													new Predicate("colorFound", new Term[] {
														Primitive.newPrimitive(false)
													})
												),
												new Block(
													"bw4t.BlockMovement", new int[] {142,63,157,21},
													new Statement[] {
														new ModuleCall("environment",
															"bw4t.BlockMovement", new int[] {143,24,143,54},
															new Predicate("goToBlock", new Term[] {
																new Variable(Type.LONG, "colorId")
															}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return true;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((astra.lang.EIS) intention.getModule("bw4t.BlockMovement","environment")).auto_action(intention,evaluate(intention,predicate));
																}
															}
														),
														new Wait(
															"bw4t.BlockMovement", new int[] {144,24,157,21},
															new ModuleFormula("environment",
																new Predicate("state", new Term[] {
																	Primitive.newPrimitive("arrived")
																}),
																new ModuleFormulaAdaptor() {
																	public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																		return ((astra.lang.EIS) visitor.agent().getModule("bw4t.BlockMovement","environment")).auto_formula((Predicate) predicate.accept(visitor));
																	}
																}
															)
														),
														new ModuleCall("environment",
															"bw4t.BlockMovement", new int[] {145,24,145,51},
															new Predicate("pickUp", new Term[] {
																new Variable(Type.LONG, "colorId")
															}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return true;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((astra.lang.EIS) intention.getModule("bw4t.BlockMovement","environment")).auto_action(intention,evaluate(intention,predicate));
																}
															}
														),
														new BeliefUpdate('-',
															"bw4t.BlockMovement", new int[] {146,24,157,21},
															new Predicate("colorFound", new Term[] {
																Primitive.newPrimitive(false)
															})
														),
														new BeliefUpdate('+',
															"bw4t.BlockMovement", new int[] {147,24,157,21},
															new Predicate("colorFound", new Term[] {
																Primitive.newPrimitive(true)
															})
														),
														new If(
															"bw4t.BlockMovement", new int[] {150,24,157,21},
															new Predicate("colorFound", new Term[] {
																Primitive.newPrimitive(true)
															}),
															new Block(
																"bw4t.BlockMovement", new int[] {150,44,156,25},
																new Statement[] {
																	new ModuleCall("environment",
																		"bw4t.BlockMovement", new int[] {151,28,151,56},
																		new Predicate("goTo", new Term[] {
																			Primitive.newPrimitive("DropZone")
																		}),
																		new DefaultModuleCallAdaptor() {
																			public boolean inline() {
																				return true;
																			}

																			public boolean invoke(Intention intention, Predicate predicate) {
																				return ((astra.lang.EIS) intention.getModule("bw4t.BlockMovement","environment")).auto_action(intention,evaluate(intention,predicate));
																			}
																		}
																	),
																	new Wait(
																		"bw4t.BlockMovement", new int[] {152,28,156,25},
																		new ModuleFormula("environment",
																			new Predicate("at", new Term[] {
																				Primitive.newPrimitive("DropZone")
																			}),
																			new ModuleFormulaAdaptor() {
																				public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																					return ((astra.lang.EIS) visitor.agent().getModule("bw4t.BlockMovement","environment")).auto_formula((Predicate) predicate.accept(visitor));
																				}
																			}
																		)
																	),
																	new ModuleCall("environment",
																		"bw4t.BlockMovement", new int[] {153,28,153,49},
																		new Predicate("putDown", new Term[] {}),
																		new DefaultModuleCallAdaptor() {
																			public boolean inline() {
																				return true;
																			}

																			public boolean invoke(Intention intention, Predicate predicate) {
																				return ((astra.lang.EIS) intention.getModule("bw4t.BlockMovement","environment")).auto_action(intention,evaluate(intention,predicate));
																			}
																		}
																	),
																	new ModuleCall("environment",
																		"bw4t.BlockMovement", new int[] {154,28,154,61},
																		new Predicate("goTo", new Term[] {
																			Primitive.newPrimitive("FrontDropZone")
																		}),
																		new DefaultModuleCallAdaptor() {
																			public boolean inline() {
																				return true;
																			}

																			public boolean invoke(Intention intention, Predicate predicate) {
																				return ((astra.lang.EIS) intention.getModule("bw4t.BlockMovement","environment")).auto_action(intention,evaluate(intention,predicate));
																			}
																		}
																	),
																	new ModuleCall("console",
																		"bw4t.BlockMovement", new int[] {155,28,155,85},
																		new Predicate("println", new Term[] {
																			Operator.newOperator('+',
																				new Variable(Type.STRING, "currentColor"),
																				Primitive.newPrimitive(" : Dropped successfully")
																			)
																		}),
																		new DefaultModuleCallAdaptor() {
																			public boolean inline() {
																				return false;
																			}

																			public boolean invoke(Intention intention, Predicate predicate) {
																				return ((astra.lang.Console) intention.getModule("bw4t.BlockMovement","console")).println(
																					(java.lang.String) intention.evaluate(predicate.getTerm(0))
																				);
																			}
																		}
																	)
																}
															)
														)
													}
												)
											)
										}
									)
								),
								new If(
									"bw4t.BlockMovement", new int[] {160,16,163,13},
									new Comparison("==",
										new Variable(Type.INTEGER, "match"),
										Primitive.newPrimitive(1)
									),
									new Block(
										"bw4t.BlockMovement", new int[] {160,27,162,17},
										new Statement[] {
											new BeliefUpdate('-',
												"bw4t.BlockMovement", new int[] {161,20,162,17},
												new Predicate("roomColor", new Term[] {
													new Variable(Type.STRING, "room"),
													new Variable(Type.STRING, "currentColor")
												})
											)
										}
									)
								)
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.BlockMovement", new int[] {179,13,179,75},
			new GoalEvent('+',
				new Goal(
					new Predicate("multipleRobotsMovement", new Term[] {
						new Variable(Type.LIST, "colorsSequence",false),
						new Variable(Type.INTEGER, "agentCount",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"bw4t.BlockMovement", new int[] {179,74,248,9},
				new Statement[] {
					new Query(
						"bw4t.BlockMovement", new int[] {180,12,180,39},
						new Predicate("getRooms", new Term[] {
							new Variable(Type.LIST, "rooms",false)
						})
					),
					new Query(
						"bw4t.BlockMovement", new int[] {181,12,181,41},
						new Predicate("agents", new Term[] {
							new Variable(Type.LIST, "agentList",false)
						})
					),
					new Declaration(
						new Variable(Type.INTEGER, "position"),
						"bw4t.BlockMovement", new int[] {182,12,248,9},
						Primitive.newPrimitive(0)
					),
					new ForAll(
						"bw4t.BlockMovement", new int[] {185,12,185,51},
						new Variable(Type.STRING, "seqColr",false),
						new Variable(Type.LIST, "colorsSequence"),
						new Block(
							"bw4t.BlockMovement", new int[] {185,51,248,9},
							new Statement[] {
								new Assignment(
									new Variable(Type.INTEGER, "position"),
									"bw4t.BlockMovement", new int[] {186,16,188,13},
									Operator.newOperator('+',
										new Variable(Type.INTEGER, "position"),
										Primitive.newPrimitive(1)
									)
								),
								new BeliefUpdate('+',
									"bw4t.BlockMovement", new int[] {187,16,188,13},
									new Predicate("colorFoundPosition", new Term[] {
										new Variable(Type.INTEGER, "position"),
										new Variable(Type.STRING, "seqColr"),
										Primitive.newPrimitive(false)
									})
								)
							}
						)
					),
					new If(
						"bw4t.BlockMovement", new int[] {191,12,248,9},
						new Comparison("==",
							new Variable(Type.INTEGER, "agentCount"),
							Primitive.newPrimitive(1)
						),
						new Block(
							"bw4t.BlockMovement", new int[] {191,28,218,13},
							new Statement[] {
								new ForAll(
									"bw4t.BlockMovement", new int[] {192,16,192,56},
									new Variable(Type.STRING, "assignedAgent",false),
									new Variable(Type.LIST, "agentList"),
									new Block(
										"bw4t.BlockMovement", new int[] {192,56,218,13},
										new Statement[] {
											new Send("bw4t.BlockMovement", new int[] {193,20,193,68},
												new Performative("inform"),
												new Variable(Type.STRING, "assignedAgent"),
												new Predicate("getRooms", new Term[] {
													new Variable(Type.LIST, "rooms")
												}),
												new ListTerm(new Term[] {

												})
											),
											new Send("bw4t.BlockMovement", new int[] {194,20,194,83},
												new Performative("request"),
												new Variable(Type.STRING, "assignedAgent"),
												new Predicate("findColorsInRooms", new Term[] {
													new Variable(Type.INTEGER, "agentCount")
												}),
												new ListTerm(new Term[] {

												})
											),
											new ModuleCall("system",
												"bw4t.BlockMovement", new int[] {195,20,195,37},
												new Predicate("sleep", new Term[] {
													Primitive.newPrimitive(1000)
												}),
												new DefaultModuleCallAdaptor() {
													public boolean inline() {
														return false;
													}

													public boolean invoke(Intention intention, Predicate predicate) {
														return ((astra.lang.System) intention.getModule("bw4t.BlockMovement","system")).sleep(
															(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
														);
													}
												}
											)
										}
									)
								),
								new ForAll(
									"bw4t.BlockMovement", new int[] {197,16,197,42},
									new Variable(Type.STRING, "room",false),
									new Variable(Type.LIST, "rooms"),
									new Block(
										"bw4t.BlockMovement", new int[] {197,42,218,13},
										new Statement[] {
											new If(
												"bw4t.BlockMovement", new int[] {198,20,205,17},
												new AND(
													new NOT(
														new Predicate("roomVisited", new Term[] {
															new Variable(Type.STRING, "room"),
															Primitive.newPrimitive(true)
														})
													),
													new AND(
														new NOT(
															new Predicate("occupied", new Term[] {
																new Variable(Type.STRING, "room")
															})
														),
														new NOT(
															new Predicate("goingTo", new Term[] {
																new Variable(Type.STRING, "room")
															})
														)
													)
												),
												new Block(
													"bw4t.BlockMovement", new int[] {198,82,204,21},
													new Statement[] {
														new BeliefUpdate('+',
															"bw4t.BlockMovement", new int[] {199,24,204,21},
															new Predicate("goingTo", new Term[] {
																new Variable(Type.STRING, "room")
															})
														),
														new ForAll(
															"bw4t.BlockMovement", new int[] {200,24,200,64},
															new Variable(Type.STRING, "assignedAgent",false),
															new Variable(Type.LIST, "agentList"),
															new Block(
																"bw4t.BlockMovement", new int[] {200,64,204,21},
																new Statement[] {
																	new Send("bw4t.BlockMovement", new int[] {201,28,201,74},
																		new Performative("inform"),
																		new Variable(Type.STRING, "assignedAgent"),
																		new Predicate("goingTo", new Term[] {
																			new Variable(Type.STRING, "room")
																		}),
																		new ListTerm(new Term[] {

																		})
																	)
																}
															)
														),
														new Subgoal(
															"bw4t.BlockMovement", new int[] {203,24,204,21},
															new Goal(
																new Predicate("findColorsInRooms", new Term[] {
																	new Variable(Type.STRING, "room"),
																	new Variable(Type.LIST, "colorsSequence"),
																	new Variable(Type.LIST, "agentList")
																})
															)
														)
													}
												)
											)
										}
									)
								),
								new ModuleCall("environment",
									"bw4t.BlockMovement", new int[] {206,16,206,49},
									new Predicate("goTo", new Term[] {
										Primitive.newPrimitive("FrontDropZone")
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return true;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.EIS) intention.getModule("bw4t.BlockMovement","environment")).auto_action(intention,evaluate(intention,predicate));
										}
									}
								),
								new Declaration(
									new Variable(Type.INTEGER, "realPosition"),
									"bw4t.BlockMovement", new int[] {209,16,218,13},
									Primitive.newPrimitive(0)
								),
								new ForAll(
									"bw4t.BlockMovement", new int[] {210,16,210,55},
									new Variable(Type.STRING, "seqColr",false),
									new Variable(Type.LIST, "colorsSequence"),
									new Block(
										"bw4t.BlockMovement", new int[] {210,55,218,13},
										new Statement[] {
											new Assignment(
												new Variable(Type.INTEGER, "realPosition"),
												"bw4t.BlockMovement", new int[] {211,20,217,17},
												Operator.newOperator('+',
													new Variable(Type.INTEGER, "realPosition"),
													Primitive.newPrimitive(1)
												)
											),
											new ForAll(
												"bw4t.BlockMovement", new int[] {212,20,212,46},
												new Variable(Type.STRING, "room",false),
												new Variable(Type.LIST, "rooms"),
												new Block(
													"bw4t.BlockMovement", new int[] {212,46,217,17},
													new Statement[] {
														new If(
															"bw4t.BlockMovement", new int[] {213,24,216,21},
															new AND(
																new Predicate("roomColor", new Term[] {
																	new Variable(Type.STRING, "room"),
																	new Variable(Type.STRING, "seqColr")
																}),
																new Predicate("colorFoundPosition", new Term[] {
																	new Variable(Type.INTEGER, "realPosition"),
																	new Variable(Type.STRING, "seqColr"),
																	Primitive.newPrimitive(false)
																})
															),
															new Block(
																"bw4t.BlockMovement", new int[] {213,100,215,25},
																new Statement[] {
																	new Subgoal(
																		"bw4t.BlockMovement", new int[] {214,28,215,25},
																		new Goal(
																			new Predicate("completeTheTask", new Term[] {
																				new Variable(Type.STRING, "room"),
																				new Variable(Type.STRING, "seqColr"),
																				new Variable(Type.INTEGER, "realPosition")
																			})
																		)
																	)
																}
															)
														)
													}
												)
											)
										}
									)
								)
							}
						),
						new If(
							"bw4t.BlockMovement", new int[] {220,17,248,9},
							new Comparison(">",
								new Variable(Type.INTEGER, "agentCount"),
								Primitive.newPrimitive(1)
							),
							new Block(
								"bw4t.BlockMovement", new int[] {220,34,247,13},
								new Statement[] {
									new ForAll(
										"bw4t.BlockMovement", new int[] {221,16,221,56},
										new Variable(Type.STRING, "assignedAgent",false),
										new Variable(Type.LIST, "agentList"),
										new Block(
											"bw4t.BlockMovement", new int[] {221,56,247,13},
											new Statement[] {
												new Send("bw4t.BlockMovement", new int[] {222,20,222,67},
													new Performative("inform"),
													new Variable(Type.STRING, "assignedAgent"),
													new Predicate("getRooms", new Term[] {
														new Variable(Type.LIST, "rooms")
													}),
													new ListTerm(new Term[] {

													})
												),
												new Send("bw4t.BlockMovement", new int[] {223,20,223,83},
													new Performative("request"),
													new Variable(Type.STRING, "assignedAgent"),
													new Predicate("findColorsInRooms", new Term[] {
														new Variable(Type.INTEGER, "agentCount")
													}),
													new ListTerm(new Term[] {

													})
												),
												new ModuleCall("system",
													"bw4t.BlockMovement", new int[] {224,20,224,37},
													new Predicate("sleep", new Term[] {
														Primitive.newPrimitive(1000)
													}),
													new DefaultModuleCallAdaptor() {
														public boolean inline() {
															return false;
														}

														public boolean invoke(Intention intention, Predicate predicate) {
															return ((astra.lang.System) intention.getModule("bw4t.BlockMovement","system")).sleep(
																(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
															);
														}
													}
												)
											}
										)
									),
									new ForAll(
										"bw4t.BlockMovement", new int[] {226,16,226,42},
										new Variable(Type.STRING, "room",false),
										new Variable(Type.LIST, "rooms"),
										new Block(
											"bw4t.BlockMovement", new int[] {226,42,247,13},
											new Statement[] {
												new If(
													"bw4t.BlockMovement", new int[] {227,20,234,17},
													new AND(
														new NOT(
															new Predicate("roomVisited", new Term[] {
																new Variable(Type.STRING, "room"),
																Primitive.newPrimitive(true)
															})
														),
														new AND(
															new NOT(
																new Predicate("occupied", new Term[] {
																	new Variable(Type.STRING, "room")
																})
															),
															new NOT(
																new Predicate("goingTo", new Term[] {
																	new Variable(Type.STRING, "room")
																})
															)
														)
													),
													new Block(
														"bw4t.BlockMovement", new int[] {227,82,233,21},
														new Statement[] {
															new BeliefUpdate('+',
																"bw4t.BlockMovement", new int[] {228,24,233,21},
																new Predicate("goingTo", new Term[] {
																	new Variable(Type.STRING, "room")
																})
															),
															new ForAll(
																"bw4t.BlockMovement", new int[] {229,24,229,64},
																new Variable(Type.STRING, "assignedAgent",false),
																new Variable(Type.LIST, "agentList"),
																new Block(
																	"bw4t.BlockMovement", new int[] {229,64,233,21},
																	new Statement[] {
																		new Send("bw4t.BlockMovement", new int[] {230,28,230,73},
																			new Performative("inform"),
																			new Variable(Type.STRING, "assignedAgent"),
																			new Predicate("goingTo", new Term[] {
																				new Variable(Type.STRING, "room")
																			}),
																			new ListTerm(new Term[] {

																			})
																		)
																	}
																)
															),
															new Subgoal(
																"bw4t.BlockMovement", new int[] {232,24,233,21},
																new Goal(
																	new Predicate("findColorsInRooms", new Term[] {
																		new Variable(Type.STRING, "room"),
																		new Variable(Type.LIST, "colorsSequence"),
																		new Variable(Type.LIST, "agentList")
																	})
																)
															)
														}
													)
												)
											}
										)
									),
									new ModuleCall("environment",
										"bw4t.BlockMovement", new int[] {235,16,235,49},
										new Predicate("goTo", new Term[] {
											Primitive.newPrimitive("FrontDropZone")
										}),
										new DefaultModuleCallAdaptor() {
											public boolean inline() {
												return true;
											}

											public boolean invoke(Intention intention, Predicate predicate) {
												return ((astra.lang.EIS) intention.getModule("bw4t.BlockMovement","environment")).auto_action(intention,evaluate(intention,predicate));
											}
										}
									),
									new Declaration(
										new Variable(Type.INTEGER, "realPosition"),
										"bw4t.BlockMovement", new int[] {238,16,247,13},
										Primitive.newPrimitive(0)
									),
									new ForAll(
										"bw4t.BlockMovement", new int[] {239,16,239,55},
										new Variable(Type.STRING, "seqColr",false),
										new Variable(Type.LIST, "colorsSequence"),
										new Block(
											"bw4t.BlockMovement", new int[] {239,55,247,13},
											new Statement[] {
												new Assignment(
													new Variable(Type.INTEGER, "realPosition"),
													"bw4t.BlockMovement", new int[] {240,20,246,17},
													Operator.newOperator('+',
														new Variable(Type.INTEGER, "realPosition"),
														Primitive.newPrimitive(1)
													)
												),
												new ForAll(
													"bw4t.BlockMovement", new int[] {241,20,241,46},
													new Variable(Type.STRING, "room",false),
													new Variable(Type.LIST, "rooms"),
													new Block(
														"bw4t.BlockMovement", new int[] {241,46,246,17},
														new Statement[] {
															new If(
																"bw4t.BlockMovement", new int[] {242,24,245,21},
																new AND(
																	new Predicate("roomColor", new Term[] {
																		new Variable(Type.STRING, "room"),
																		new Variable(Type.STRING, "seqColr")
																	}),
																	new Predicate("colorFoundPosition", new Term[] {
																		new Variable(Type.INTEGER, "realPosition"),
																		new Variable(Type.STRING, "seqColr"),
																		Primitive.newPrimitive(false)
																	})
																),
																new Block(
																	"bw4t.BlockMovement", new int[] {242,100,244,25},
																	new Statement[] {
																		new Subgoal(
																			"bw4t.BlockMovement", new int[] {243,28,244,25},
																			new Goal(
																				new Predicate("completeTheTask", new Term[] {
																					new Variable(Type.STRING, "room"),
																					new Variable(Type.STRING, "seqColr"),
																					new Variable(Type.INTEGER, "realPosition")
																				})
																			)
																		)
																	}
																)
															)
														}
													)
												)
											}
										)
									)
								}
							)
						)
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.BlockMovement", new int[] {256,13,256,82},
			new GoalEvent('+',
				new Goal(
					new Predicate("findColorsInRooms", new Term[] {
						new Variable(Type.STRING, "room",false),
						new Variable(Type.LIST, "colorsSequence",false),
						new Variable(Type.LIST, "agentList",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"bw4t.BlockMovement", new int[] {256,81,270,9},
				new Statement[] {
					new ModuleCall("environment",
						"bw4t.BlockMovement", new int[] {257,12,257,34},
						new Predicate("goTo", new Term[] {
							new Variable(Type.STRING, "room")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("bw4t.BlockMovement","environment")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new BeliefUpdate('+',
						"bw4t.BlockMovement", new int[] {258,12,270,9},
						new Predicate("roomVisited", new Term[] {
							new Variable(Type.STRING, "room"),
							Primitive.newPrimitive(true)
						})
					),
					new Wait(
						"bw4t.BlockMovement", new int[] {259,12,270,9},
						new ModuleFormula("environment",
							new Predicate("at", new Term[] {
								new Variable(Type.STRING, "room")
							}),
							new ModuleFormulaAdaptor() {
								public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("bw4t.BlockMovement","environment")).auto_formula((Predicate) predicate.accept(visitor));
								}
							}
						)
					),
					new ForEach(
						"bw4t.BlockMovement", new int[] {260,12,270,9},
						new ModuleFormula("environment",
							new Predicate("color", new Term[] {
								new Variable(Type.LONG, "colorId",false),
								new Variable(Type.STRING, "color",false)
							}),
							new ModuleFormulaAdaptor() {
								public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("bw4t.BlockMovement","environment")).auto_formula((Predicate) predicate.accept(visitor));
								}
							}
						),
						new Block(
							"bw4t.BlockMovement", new int[] {260,68,265,13},
							new Statement[] {
								new BeliefUpdate('+',
									"bw4t.BlockMovement", new int[] {261,16,265,13},
									new Predicate("roomColor", new Term[] {
										new Variable(Type.STRING, "room"),
										new Variable(Type.STRING, "color")
									})
								),
								new ForAll(
									"bw4t.BlockMovement", new int[] {262,16,262,56},
									new Variable(Type.STRING, "assignedAgent",false),
									new Variable(Type.LIST, "agentList"),
									new Block(
										"bw4t.BlockMovement", new int[] {262,56,265,13},
										new Statement[] {
											new Send("bw4t.BlockMovement", new int[] {263,20,263,72},
												new Performative("inform"),
												new Variable(Type.STRING, "assignedAgent"),
												new Predicate("roomColor", new Term[] {
													new Variable(Type.STRING, "room"),
													new Variable(Type.STRING, "color")
												}),
												new ListTerm(new Term[] {

												})
											)
										}
									)
								)
							}
						)
					),
					new ForAll(
						"bw4t.BlockMovement", new int[] {266,12,266,52},
						new Variable(Type.STRING, "assignedAgent",false),
						new Variable(Type.LIST, "agentList"),
						new Block(
							"bw4t.BlockMovement", new int[] {266,52,270,9},
							new Statement[] {
								new Send("bw4t.BlockMovement", new int[] {267,20,267,73},
									new Performative("inform"),
									new Variable(Type.STRING, "assignedAgent"),
									new Predicate("roomVisited", new Term[] {
										new Variable(Type.STRING, "room"),
										Primitive.newPrimitive(true)
									}),
									new ListTerm(new Term[] {

									})
								)
							}
						)
					),
					new BeliefUpdate('-',
						"bw4t.BlockMovement", new int[] {269,12,270,9},
						new Predicate("occupied", new Term[] {
							new Variable(Type.STRING, "room")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.BlockMovement", new int[] {276,13,276,82},
			new GoalEvent('+',
				new Goal(
					new Predicate("completeTheTask", new Term[] {
						new Variable(Type.STRING, "room",false),
						new Variable(Type.STRING, "currentColor",false),
						new Variable(Type.INTEGER, "realPosition",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"bw4t.BlockMovement", new int[] {276,81,301,9},
				new Statement[] {
					new ModuleCall("environment",
						"bw4t.BlockMovement", new int[] {277,12,277,34},
						new Predicate("goTo", new Term[] {
							new Variable(Type.STRING, "room")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("bw4t.BlockMovement","environment")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new Wait(
						"bw4t.BlockMovement", new int[] {278,12,301,9},
						new ModuleFormula("environment",
							new Predicate("at", new Term[] {
								new Variable(Type.STRING, "room")
							}),
							new ModuleFormulaAdaptor() {
								public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("bw4t.BlockMovement","environment")).auto_formula((Predicate) predicate.accept(visitor));
								}
							}
						)
					),
					new Declaration(
						new Variable(Type.INTEGER, "match"),
						"bw4t.BlockMovement", new int[] {279,12,301,9},
						Primitive.newPrimitive(0)
					),
					new ForEach(
						"bw4t.BlockMovement", new int[] {280,12,301,9},
						new ModuleFormula("environment",
							new Predicate("color", new Term[] {
								new Variable(Type.LONG, "colorId",false),
								new Variable(Type.STRING, "color",false)
							}),
							new ModuleFormulaAdaptor() {
								public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("bw4t.BlockMovement","environment")).auto_formula((Predicate) predicate.accept(visitor));
								}
							}
						),
						new Block(
							"bw4t.BlockMovement", new int[] {280,68,300,13},
							new Statement[] {
								new If(
									"bw4t.BlockMovement", new int[] {281,20,300,13},
									new Comparison("==",
										new Variable(Type.STRING, "color"),
										new Variable(Type.STRING, "currentColor")
									),
									new Block(
										"bw4t.BlockMovement", new int[] {281,45,299,17},
										new Statement[] {
											new Assignment(
												new Variable(Type.INTEGER, "match"),
												"bw4t.BlockMovement", new int[] {282,24,299,17},
												Operator.newOperator('+',
													new Variable(Type.INTEGER, "match"),
													Primitive.newPrimitive(1)
												)
											),
											new If(
												"bw4t.BlockMovement", new int[] {283,24,299,17},
												new Comparison("==",
													new Variable(Type.INTEGER, "match"),
													Primitive.newPrimitive(1)
												),
												new Block(
													"bw4t.BlockMovement", new int[] {283,35,294,25},
													new Statement[] {
														new ModuleCall("environment",
															"bw4t.BlockMovement", new int[] {284,28,284,58},
															new Predicate("goToBlock", new Term[] {
																new Variable(Type.LONG, "colorId")
															}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return true;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((astra.lang.EIS) intention.getModule("bw4t.BlockMovement","environment")).auto_action(intention,evaluate(intention,predicate));
																}
															}
														),
														new Wait(
															"bw4t.BlockMovement", new int[] {285,28,294,25},
															new ModuleFormula("environment",
																new Predicate("state", new Term[] {
																	Primitive.newPrimitive("arrived")
																}),
																new ModuleFormulaAdaptor() {
																	public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																		return ((astra.lang.EIS) visitor.agent().getModule("bw4t.BlockMovement","environment")).auto_formula((Predicate) predicate.accept(visitor));
																	}
																}
															)
														),
														new ModuleCall("environment",
															"bw4t.BlockMovement", new int[] {286,28,286,55},
															new Predicate("pickUp", new Term[] {
																new Variable(Type.LONG, "colorId")
															}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return true;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((astra.lang.EIS) intention.getModule("bw4t.BlockMovement","environment")).auto_action(intention,evaluate(intention,predicate));
																}
															}
														),
														new ModuleCall("environment",
															"bw4t.BlockMovement", new int[] {287,28,287,56},
															new Predicate("goTo", new Term[] {
																Primitive.newPrimitive("DropZone")
															}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return true;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((astra.lang.EIS) intention.getModule("bw4t.BlockMovement","environment")).auto_action(intention,evaluate(intention,predicate));
																}
															}
														),
														new Wait(
															"bw4t.BlockMovement", new int[] {288,28,294,25},
															new ModuleFormula("environment",
																new Predicate("at", new Term[] {
																	Primitive.newPrimitive("DropZone")
																}),
																new ModuleFormulaAdaptor() {
																	public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																		return ((astra.lang.EIS) visitor.agent().getModule("bw4t.BlockMovement","environment")).auto_formula((Predicate) predicate.accept(visitor));
																	}
																}
															)
														),
														new ModuleCall("environment",
															"bw4t.BlockMovement", new int[] {289,28,289,49},
															new Predicate("putDown", new Term[] {}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return true;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((astra.lang.EIS) intention.getModule("bw4t.BlockMovement","environment")).auto_action(intention,evaluate(intention,predicate));
																}
															}
														),
														new ModuleCall("environment",
															"bw4t.BlockMovement", new int[] {290,28,290,61},
															new Predicate("goTo", new Term[] {
																Primitive.newPrimitive("FrontDropZone")
															}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return true;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((astra.lang.EIS) intention.getModule("bw4t.BlockMovement","environment")).auto_action(intention,evaluate(intention,predicate));
																}
															}
														),
														new BeliefUpdate('-',
															"bw4t.BlockMovement", new int[] {291,28,294,25},
															new Predicate("roomColor", new Term[] {
																new Variable(Type.STRING, "room"),
																new Variable(Type.STRING, "currentColor")
															})
														),
														new BeliefUpdate('-',
															"bw4t.BlockMovement", new int[] {292,28,294,25},
															new Predicate("colorFoundPosition", new Term[] {
																new Variable(Type.INTEGER, "realPosition"),
																new Variable(Type.STRING, "currentColor"),
																Primitive.newPrimitive(false)
															})
														),
														new BeliefUpdate('+',
															"bw4t.BlockMovement", new int[] {293,28,294,25},
															new Predicate("colorFoundPosition", new Term[] {
																new Variable(Type.INTEGER, "realPosition"),
																new Variable(Type.STRING, "currentColor"),
																Primitive.newPrimitive(true)
															})
														)
													}
												)
											),
											new If(
												"bw4t.BlockMovement", new int[] {295,24,299,17},
												new Comparison(">",
													new Variable(Type.INTEGER, "match"),
													Primitive.newPrimitive(1)
												),
												new Block(
													"bw4t.BlockMovement", new int[] {295,34,297,25},
													new Statement[] {
														new BeliefUpdate('+',
															"bw4t.BlockMovement", new int[] {296,28,297,25},
															new Predicate("roomColor", new Term[] {
																new Variable(Type.STRING, "room"),
																new Variable(Type.STRING, "currentColor")
															})
														)
													}
												)
											),
											new ModuleCall("console",
												"bw4t.BlockMovement", new int[] {298,24,298,81},
												new Predicate("println", new Term[] {
													Operator.newOperator('+',
														new Variable(Type.STRING, "currentColor"),
														Primitive.newPrimitive(" : Dropped successfully")
													)
												}),
												new DefaultModuleCallAdaptor() {
													public boolean inline() {
														return false;
													}

													public boolean invoke(Intention intention, Predicate predicate) {
														return ((astra.lang.Console) intention.getModule("bw4t.BlockMovement","console")).println(
															(java.lang.String) intention.evaluate(predicate.getTerm(0))
														);
													}
												}
											)
										}
									)
								)
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.BlockMovement", new int[] {311,9,311,53},
			new ModuleEvent("environment",
				"$eis",
				new Predicate("event", new Term[] {
					new Funct("occupied", new Term[] {
						new Variable(Type.STRING, "room",false)
					})
				}),
				new ModuleEventAdaptor() {
					public Event generate(astra.core.Agent agent, Predicate predicate) {
						return ((astra.lang.EIS) agent.getModule("bw4t.BlockMovement","environment")).event(
							"+",
							predicate.getTerm(0)
						);
					}
				}
			),
			Predicate.TRUE,
			new Block(
				"bw4t.BlockMovement", new int[] {311,52,313,5},
				new Statement[] {
					new BeliefUpdate('+',
						"bw4t.BlockMovement", new int[] {312,8,313,5},
						new Predicate("occupied", new Term[] {
							new Variable(Type.STRING, "room")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.BlockMovement", new int[] {317,9,317,61},
			new ModuleEvent("environment",
				"$eis",
				new Predicate("event", new Term[] {
					new Funct("sequence", new Term[] {
						new Variable(Type.LIST, "colorsSequence",false)
					})
				}),
				new ModuleEventAdaptor() {
					public Event generate(astra.core.Agent agent, Predicate predicate) {
						return ((astra.lang.EIS) agent.getModule("bw4t.BlockMovement","environment")).event(
							"+",
							predicate.getTerm(0)
						);
					}
				}
			),
			Predicate.TRUE,
			new Block(
				"bw4t.BlockMovement", new int[] {317,60,319,5},
				new Statement[] {
					new BeliefUpdate('+',
						"bw4t.BlockMovement", new int[] {318,8,319,5},
						new Predicate("sequence", new Term[] {
							new Variable(Type.LIST, "colorsSequence")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.BlockMovement", new int[] {326,9,326,63},
			new MessageEvent(
				new Performative("inform"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("state", new Term[] {
					new Variable(Type.STRING, "X",false)
				}),
				new ListTerm(new Term[] {

				})
			),
			Predicate.TRUE,
			new Block(
				"bw4t.BlockMovement", new int[] {326,62,334,6},
				new Statement[] {
					new ModuleCall("console",
						"bw4t.BlockMovement", new int[] {327,14,327,54},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								new Variable(Type.STRING, "sender"),
								Primitive.newPrimitive(" is created!")
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("bw4t.BlockMovement","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Query(
						"bw4t.BlockMovement", new int[] {330,14,330,43},
						new Predicate("agents", new Term[] {
							new Variable(Type.LIST, "agentList",false)
						})
					),
					new ModuleCall("listOperation",
						"bw4t.BlockMovement", new int[] {331,14,331,49},
						new Predicate("add", new Term[] {
							new Variable(Type.LIST, "agentList"),
							new Variable(Type.STRING, "sender")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Prelude) intention.getModule("bw4t.BlockMovement","listOperation")).add(
									(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
									(java.lang.String) intention.evaluate(predicate.getTerm(1))
								);
							}
						}
					),
					new BeliefUpdate('+',
						"bw4t.BlockMovement", new int[] {332,14,334,6},
						new Predicate("agents", new Term[] {
							new Variable(Type.LIST, "agentList")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.BlockMovement", new int[] {339,9,339,87},
			new MessageEvent(
				new Performative("inform"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("roomVisited", new Term[] {
					new Variable(Type.STRING, "room",false),
					new Variable(Type.BOOLEAN, "status",false)
				}),
				new ListTerm(new Term[] {

				})
			),
			Predicate.TRUE,
			new Block(
				"bw4t.BlockMovement", new int[] {339,86,342,6},
				new Statement[] {
					new ModuleCall("console",
						"bw4t.BlockMovement", new int[] {340,8,340,51},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Room visited ::: "),
								new Variable(Type.STRING, "room")
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("bw4t.BlockMovement","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new BeliefUpdate('+',
						"bw4t.BlockMovement", new int[] {341,9,342,6},
						new Predicate("roomVisited", new Term[] {
							new Variable(Type.STRING, "room"),
							new Variable(Type.BOOLEAN, "status")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.BlockMovement", new int[] {347,11,347,85},
			new MessageEvent(
				new Performative("inform"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("roomColor", new Term[] {
					new Variable(Type.STRING, "room",false),
					new Variable(Type.STRING, "color",false)
				}),
				new ListTerm(new Term[] {

				})
			),
			Predicate.TRUE,
			new Block(
				"bw4t.BlockMovement", new int[] {347,84,349,6},
				new Statement[] {
					new BeliefUpdate('+',
						"bw4t.BlockMovement", new int[] {348,9,349,6},
						new Predicate("roomColor", new Term[] {
							new Variable(Type.STRING, "room"),
							new Variable(Type.STRING, "color")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.BlockMovement", new int[] {354,10,354,69},
			new MessageEvent(
				new Performative("inform"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("goingTo", new Term[] {
					new Variable(Type.STRING, "room",false)
				}),
				new ListTerm(new Term[] {

				})
			),
			Predicate.TRUE,
			new Block(
				"bw4t.BlockMovement", new int[] {354,68,356,6},
				new Statement[] {
					new BeliefUpdate('+',
						"bw4t.BlockMovement", new int[] {355,9,356,6},
						new Predicate("goingTo", new Term[] {
							new Variable(Type.STRING, "room")
						})
					)
				}
			)
		));
	}

	public void initialize(astra.core.Agent agent) {
		agent.addSensorAdaptor(new SensorAdaptor() {
			public void sense(astra.core.Agent agent) {
				((astra.lang.EIS) agent.getModule("bw4t.BlockMovement","environment")).sense();
			}
		});

		agent.initialize(
			new Goal(
				new Predicate("init", new Term[] {})
			)
		);
		agent.initialize(
			new Predicate("agents", new Term[] {
				new ListTerm(new Term[] {

				})
			})
		);
		agent.initialize(
			new Predicate("colorFound", new Term[] {
				Primitive.newPrimitive(false)
			})
		);
		agent.initialize(
			new Predicate("getRooms", new Term[] {
				new ListTerm(new Term[] {
					Primitive.newPrimitive("RoomC1"),
					Primitive.newPrimitive("RoomC2"),
					Primitive.newPrimitive("RoomC3"),
					Primitive.newPrimitive("RoomB3"),
					Primitive.newPrimitive("RoomB2"),
					Primitive.newPrimitive("RoomB1"),
					Primitive.newPrimitive("RoomA1"),
					Primitive.newPrimitive("RoomA2"),
					Primitive.newPrimitive("RoomA3")
				})
			})
		);
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		fragment.addModule("console",astra.lang.Console.class,agent);
		fragment.addModule("listOperation",astra.lang.Prelude.class,agent);
		fragment.addModule("environment",astra.lang.EIS.class,agent);
		fragment.addModule("system",astra.lang.System.class,agent);
		return fragment;
	}

	public static void main(String[] args) {
		Scheduler.setStrategy(new BasicSchedulerStrategy());
		ListTerm argList = new ListTerm();
		for (String arg: args) {
			argList.add(Primitive.newPrimitive(arg));
		}

		String name = java.lang.System.getProperty("astra.name", "main");
		try {
			astra.core.Agent agent = new BlockMovement().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}

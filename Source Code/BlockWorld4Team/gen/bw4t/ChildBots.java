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


public class ChildBots extends ASTRAClass {
	public ChildBots() {
		setParents(new Class[] {astra.lang.Agent.class});
		addRule(new Rule(
			"bw4t.ChildBots", new int[] {38,9,38,19},
			new GoalEvent('+',
				new Goal(
					new Predicate("init", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"bw4t.ChildBots", new int[] {38,18,49,6},
				new Statement[] {
					new ModuleCall("environment",
						"bw4t.ChildBots", new int[] {39,8,39,32},
						new Predicate("join", new Term[] {
							Primitive.newPrimitive("bw4t")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("bw4t.ChildBots","environment")).join(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("environment",
						"bw4t.ChildBots", new int[] {40,8,40,39},
						new Predicate("link", new Term[] {
							new ModuleTerm("system", Type.STRING,
								new Predicate("name", new Term[] {}),
								new ModuleTermAdaptor() {
									public Object invoke(Intention intention, Predicate predicate) {
										return ((astra.lang.System) intention.getModule("bw4t.ChildBots","system")).name(
										);
									}
									public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
										return ((astra.lang.System) visitor.agent().getModule("bw4t.ChildBots","system")).name(
										);
									}
								}
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("bw4t.ChildBots","environment")).link(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Send("bw4t.ChildBots", new int[] {41,8,41,57},
						new Performative("inform"),
						new ModuleTerm("system", Type.STRING,
							new Predicate("getOwner", new Term[] {}),
							new ModuleTermAdaptor() {
								public Object invoke(Intention intention, Predicate predicate) {
									return ((astra.lang.System) intention.getModule("bw4t.ChildBots","system")).getOwner(
									);
								}
								public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.System) visitor.agent().getModule("bw4t.ChildBots","system")).getOwner(
									);
								}
							}
						),
						new Predicate("state", new Term[] {
							Primitive.newPrimitive("alive")
						}),
						new ListTerm(new Term[] {

						})
					),
					new Query(
						"bw4t.ChildBots", new int[] {45,8,45,37},
						new Predicate("agents", new Term[] {
							new Variable(Type.LIST, "agentList",false)
						})
					),
					new ModuleCall("listOperation",
						"bw4t.ChildBots", new int[] {46,8,46,50},
						new Predicate("add", new Term[] {
							new Variable(Type.LIST, "agentList"),
							new ModuleTerm("system", Type.STRING,
								new Predicate("name", new Term[] {}),
								new ModuleTermAdaptor() {
									public Object invoke(Intention intention, Predicate predicate) {
										return ((astra.lang.System) intention.getModule("bw4t.ChildBots","system")).name(
										);
									}
									public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
										return ((astra.lang.System) visitor.agent().getModule("bw4t.ChildBots","system")).name(
										);
									}
								}
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Prelude) intention.getModule("bw4t.ChildBots","listOperation")).add(
									(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
									(java.lang.String) intention.evaluate(predicate.getTerm(1))
								);
							}
						}
					),
					new BeliefUpdate('+',
						"bw4t.ChildBots", new int[] {47,8,49,6},
						new Predicate("agents", new Term[] {
							new Variable(Type.LIST, "agentList")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.ChildBots", new int[] {55,10,55,63},
			new GoalEvent('+',
				new Goal(
					new Predicate("findColorsInRooms", new Term[] {
						new Variable(Type.STRING, "room",false),
						new Variable(Type.LIST, "colorsSequence",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"bw4t.ChildBots", new int[] {55,62,69,5},
				new Statement[] {
					new ModuleCall("environment",
						"bw4t.ChildBots", new int[] {56,8,56,30},
						new Predicate("goTo", new Term[] {
							new Variable(Type.STRING, "room")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("bw4t.ChildBots","environment")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new BeliefUpdate('+',
						"bw4t.ChildBots", new int[] {57,8,69,5},
						new Predicate("roomVisited", new Term[] {
							new Variable(Type.STRING, "room"),
							Primitive.newPrimitive(true)
						})
					),
					new Wait(
						"bw4t.ChildBots", new int[] {58,8,69,5},
						new ModuleFormula("environment",
							new Predicate("at", new Term[] {
								new Variable(Type.STRING, "room")
							}),
							new ModuleFormulaAdaptor() {
								public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("bw4t.ChildBots","environment")).auto_formula((Predicate) predicate.accept(visitor));
								}
							}
						)
					),
					new ForEach(
						"bw4t.ChildBots", new int[] {63,8,69,5},
						new ModuleFormula("environment",
							new Predicate("color", new Term[] {
								new Variable(Type.LONG, "colorId",false),
								new Variable(Type.STRING, "color",false)
							}),
							new ModuleFormulaAdaptor() {
								public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("bw4t.ChildBots","environment")).auto_formula((Predicate) predicate.accept(visitor));
								}
							}
						),
						new Block(
							"bw4t.ChildBots", new int[] {63,64,66,9},
							new Statement[] {
								new BeliefUpdate('+',
									"bw4t.ChildBots", new int[] {64,12,66,9},
									new Predicate("roomColor", new Term[] {
										new Variable(Type.STRING, "room"),
										new Variable(Type.STRING, "color")
									})
								),
								new Send("bw4t.ChildBots", new int[] {65,12,65,64},
									new Performative("inform"),
									new ModuleTerm("system", Type.STRING,
										new Predicate("getOwner", new Term[] {}),
										new ModuleTermAdaptor() {
											public Object invoke(Intention intention, Predicate predicate) {
												return ((astra.lang.System) intention.getModule("bw4t.ChildBots","system")).getOwner(
												);
											}
											public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
												return ((astra.lang.System) visitor.agent().getModule("bw4t.ChildBots","system")).getOwner(
												);
											}
										}
									),
									new Predicate("roomColor", new Term[] {
										new Variable(Type.STRING, "room"),
										new Variable(Type.STRING, "color")
									})
								)
							}
						)
					),
					new Send("bw4t.ChildBots", new int[] {67,8,67,61},
						new Performative("inform"),
						new ModuleTerm("system", Type.STRING,
							new Predicate("getOwner", new Term[] {}),
							new ModuleTermAdaptor() {
								public Object invoke(Intention intention, Predicate predicate) {
									return ((astra.lang.System) intention.getModule("bw4t.ChildBots","system")).getOwner(
									);
								}
								public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.System) visitor.agent().getModule("bw4t.ChildBots","system")).getOwner(
									);
								}
							}
						),
						new Predicate("roomVisited", new Term[] {
							new Variable(Type.STRING, "room"),
							Primitive.newPrimitive(true)
						})
					),
					new BeliefUpdate('-',
						"bw4t.ChildBots", new int[] {68,8,69,5},
						new Predicate("occupied", new Term[] {
							new Variable(Type.STRING, "room")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.ChildBots", new int[] {78,9,78,53},
			new ModuleEvent("environment",
				"$eis",
				new Predicate("event", new Term[] {
					new Funct("occupied", new Term[] {
						new Variable(Type.STRING, "room",false)
					})
				}),
				new ModuleEventAdaptor() {
					public Event generate(astra.core.Agent agent, Predicate predicate) {
						return ((astra.lang.EIS) agent.getModule("bw4t.ChildBots","environment")).event(
							"+",
							predicate.getTerm(0)
						);
					}
				}
			),
			Predicate.TRUE,
			new Block(
				"bw4t.ChildBots", new int[] {78,52,80,5},
				new Statement[] {
					new BeliefUpdate('+',
						"bw4t.ChildBots", new int[] {79,8,80,5},
						new Predicate("occupied", new Term[] {
							new Variable(Type.STRING, "room")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.ChildBots", new int[] {84,9,84,61},
			new ModuleEvent("environment",
				"$eis",
				new Predicate("event", new Term[] {
					new Funct("sequence", new Term[] {
						new Variable(Type.LIST, "colorsSequence",false)
					})
				}),
				new ModuleEventAdaptor() {
					public Event generate(astra.core.Agent agent, Predicate predicate) {
						return ((astra.lang.EIS) agent.getModule("bw4t.ChildBots","environment")).event(
							"+",
							predicate.getTerm(0)
						);
					}
				}
			),
			Predicate.TRUE,
			new Block(
				"bw4t.ChildBots", new int[] {84,60,86,5},
				new Statement[] {
					new BeliefUpdate('+',
						"bw4t.ChildBots", new int[] {85,8,86,5},
						new Predicate("sequence", new Term[] {
							new Variable(Type.LIST, "colorsSequence")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.ChildBots", new int[] {93,9,93,83},
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
				"bw4t.ChildBots", new int[] {93,82,95,7},
				new Statement[] {
					new BeliefUpdate('+',
						"bw4t.ChildBots", new int[] {94,10,95,7},
						new Predicate("roomColor", new Term[] {
							new Variable(Type.STRING, "room"),
							new Variable(Type.STRING, "color")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.ChildBots", new int[] {99,10,99,69},
			new MessageEvent(
				new Performative("inform"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("getRooms", new Term[] {
					new Variable(Type.LIST, "rooms",false)
				}),
				new ListTerm(new Term[] {

				})
			),
			Predicate.TRUE,
			new Block(
				"bw4t.ChildBots", new int[] {99,68,101,7},
				new Statement[] {
					new BeliefUpdate('+',
						"bw4t.ChildBots", new int[] {100,10,101,7},
						new Predicate("getRooms", new Term[] {
							new Variable(Type.LIST, "rooms")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.ChildBots", new int[] {105,10,105,88},
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
				"bw4t.ChildBots", new int[] {105,87,107,7},
				new Statement[] {
					new BeliefUpdate('+',
						"bw4t.ChildBots", new int[] {106,10,107,7},
						new Predicate("roomVisited", new Term[] {
							new Variable(Type.STRING, "room"),
							new Variable(Type.BOOLEAN, "status")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.ChildBots", new int[] {111,11,111,70},
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
				"bw4t.ChildBots", new int[] {111,69,113,7},
				new Statement[] {
					new BeliefUpdate('+',
						"bw4t.ChildBots", new int[] {112,10,113,7},
						new Predicate("goingTo", new Term[] {
							new Variable(Type.STRING, "room")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.ChildBots", new int[] {117,10,117,84},
			new MessageEvent(
				new Performative("request"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("findColorsInRooms", new Term[] {
					new Variable(Type.INTEGER, "numOfAgents",false)
				}),
				new ListTerm(new Term[] {

				})
			),
			Predicate.TRUE,
			new Block(
				"bw4t.ChildBots", new int[] {117,83,177,6},
				new Statement[] {
					new Query(
						"bw4t.ChildBots", new int[] {118,9,118,36},
						new Predicate("getRooms", new Term[] {
							new Variable(Type.LIST, "rooms",false)
						})
					),
					new Query(
						"bw4t.ChildBots", new int[] {119,9,119,45},
						new Predicate("sequence", new Term[] {
							new Variable(Type.LIST, "colorsSequence",false)
						})
					),
					new If(
						"bw4t.ChildBots", new int[] {124,9,177,6},
						new Comparison("==",
							new Variable(Type.INTEGER, "numOfAgents"),
							Primitive.newPrimitive(1)
						),
						new Block(
							"bw4t.ChildBots", new int[] {124,28,126,10},
							new Statement[] {
								new ModuleCall("listOperation",
									"bw4t.ChildBots", new int[] {125,13,125,41},
									new Predicate("reverse", new Term[] {
										new Variable(Type.LIST, "rooms")
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return false;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Prelude) intention.getModule("bw4t.ChildBots","listOperation")).reverse(
												(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								)
							}
						),
						new If(
							"bw4t.ChildBots", new int[] {126,15,177,6},
							new Comparison(">",
								new Variable(Type.INTEGER, "numOfAgents"),
								Primitive.newPrimitive(1)
							),
							new Block(
								"bw4t.ChildBots", new int[] {126,33,130,11},
								new Statement[] {
									new If(
										"bw4t.ChildBots", new int[] {127,17,130,11},
										new Comparison("==",
											new ModuleTerm("system", Type.STRING,
												new Predicate("name", new Term[] {}),
												new ModuleTermAdaptor() {
													public Object invoke(Intention intention, Predicate predicate) {
														return ((astra.lang.System) intention.getModule("bw4t.ChildBots","system")).name(
														);
													}
													public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
														return ((astra.lang.System) visitor.agent().getModule("bw4t.ChildBots","system")).name(
														);
													}
												}
											),
											Primitive.newPrimitive("Bot_2")
										),
										new Block(
											"bw4t.ChildBots", new int[] {127,43,129,18},
											new Statement[] {
												new ModuleCall("listOperation",
													"bw4t.ChildBots", new int[] {128,21,128,49},
													new Predicate("reverse", new Term[] {
														new Variable(Type.LIST, "rooms")
													}),
													new DefaultModuleCallAdaptor() {
														public boolean inline() {
															return false;
														}

														public boolean invoke(Intention intention, Predicate predicate) {
															return ((astra.lang.Prelude) intention.getModule("bw4t.ChildBots","listOperation")).reverse(
																(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
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
					),
					new Declaration(
						new Variable(Type.INTEGER, "skipRooms"),
						"bw4t.ChildBots", new int[] {131,9,177,6},
						Primitive.newPrimitive(0)
					),
					new ForAll(
						"bw4t.ChildBots", new int[] {133,9,133,35},
						new Variable(Type.STRING, "room",false),
						new Variable(Type.LIST, "rooms"),
						new Block(
							"bw4t.ChildBots", new int[] {133,35,177,6},
							new Statement[] {
								new Assignment(
									new Variable(Type.INTEGER, "skipRooms"),
									"bw4t.ChildBots", new int[] {134,13,170,9},
									Operator.newOperator('+',
										new Variable(Type.INTEGER, "skipRooms"),
										Primitive.newPrimitive(1)
									)
								),
								new If(
									"bw4t.ChildBots", new int[] {135,13,170,9},
									new AND(
										new NOT(
											new BracketFormula(
												new Comparison("==",
													new ModuleTerm("system", Type.STRING,
														new Predicate("name", new Term[] {}),
														new ModuleTermAdaptor() {
															public Object invoke(Intention intention, Predicate predicate) {
																return ((astra.lang.System) intention.getModule("bw4t.ChildBots","system")).name(
																);
															}
															public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																return ((astra.lang.System) visitor.agent().getModule("bw4t.ChildBots","system")).name(
																);
															}
														}
													),
													Primitive.newPrimitive("Bot_2")
												)
											)
										),
										new Comparison(">",
											new Variable(Type.INTEGER, "skipRooms"),
											new Variable(Type.INTEGER, "numOfAgents")
										)
									),
									new Block(
										"bw4t.ChildBots", new int[] {135,67,151,13},
										new Statement[] {
											new If(
												"bw4t.ChildBots", new int[] {136,17,151,13},
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
													"bw4t.ChildBots", new int[] {136,78,150,17},
													new Statement[] {
														new BeliefUpdate('+',
															"bw4t.ChildBots", new int[] {137,21,150,17},
															new Predicate("goingTo", new Term[] {
																new Variable(Type.STRING, "room")
															})
														),
														new Send("bw4t.ChildBots", new int[] {138,21,138,67},
															new Performative("inform"),
															new ModuleTerm("system", Type.STRING,
																new Predicate("getOwner", new Term[] {}),
																new ModuleTermAdaptor() {
																	public Object invoke(Intention intention, Predicate predicate) {
																		return ((astra.lang.System) intention.getModule("bw4t.ChildBots","system")).getOwner(
																		);
																	}
																	public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																		return ((astra.lang.System) visitor.agent().getModule("bw4t.ChildBots","system")).getOwner(
																		);
																	}
																}
															),
															new Predicate("goingTo", new Term[] {
																new Variable(Type.STRING, "room")
															})
														),
														new Query(
															"bw4t.ChildBots", new int[] {141,21,141,51},
															new Predicate("agents", new Term[] {
																new Variable(Type.LIST, "agentsList",false)
															})
														),
														new ForAll(
															"bw4t.ChildBots", new int[] {142,21,142,58},
															new Variable(Type.STRING, "agentInst",false),
															new Variable(Type.LIST, "agentsList"),
															new Block(
																"bw4t.ChildBots", new int[] {142,58,150,17},
																new Statement[] {
																	new If(
																		"bw4t.ChildBots", new int[] {143,25,146,22},
																		new NOT(
																			new BracketFormula(
																				new Comparison("==",
																					new ModuleTerm("system", Type.STRING,
																						new Predicate("name", new Term[] {}),
																						new ModuleTermAdaptor() {
																							public Object invoke(Intention intention, Predicate predicate) {
																								return ((astra.lang.System) intention.getModule("bw4t.ChildBots","system")).name(
																								);
																							}
																							public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																								return ((astra.lang.System) visitor.agent().getModule("bw4t.ChildBots","system")).name(
																								);
																							}
																						}
																					),
																					new Variable(Type.STRING, "agentInst")
																				)
																			)
																		),
																		new Block(
																			"bw4t.ChildBots", new int[] {143,56,145,26},
																			new Statement[] {
																				new Send("bw4t.ChildBots", new int[] {144,29,144,67},
																					new Performative("inform"),
																					new Variable(Type.STRING, "agentInst"),
																					new Predicate("goingTo", new Term[] {
																						new Variable(Type.STRING, "room")
																					})
																				)
																			}
																		)
																	)
																}
															)
														),
														new Subgoal(
															"bw4t.ChildBots", new int[] {149,21,150,17},
															new Goal(
																new Predicate("findColorsInRooms", new Term[] {
																	new Variable(Type.STRING, "room"),
																	new Variable(Type.LIST, "colorsSequence")
																})
															)
														)
													}
												)
											)
										}
									),
									new If(
										"bw4t.ChildBots", new int[] {154,17,170,9},
										new Comparison("==",
											new ModuleTerm("system", Type.STRING,
												new Predicate("name", new Term[] {}),
												new ModuleTermAdaptor() {
													public Object invoke(Intention intention, Predicate predicate) {
														return ((astra.lang.System) intention.getModule("bw4t.ChildBots","system")).name(
														);
													}
													public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
														return ((astra.lang.System) visitor.agent().getModule("bw4t.ChildBots","system")).name(
														);
													}
												}
											),
											Primitive.newPrimitive("Bot_2")
										),
										new Block(
											"bw4t.ChildBots", new int[] {154,43,169,13},
											new Statement[] {
												new If(
													"bw4t.ChildBots", new int[] {155,16,169,13},
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
														"bw4t.ChildBots", new int[] {155,77,168,17},
														new Statement[] {
															new BeliefUpdate('+',
																"bw4t.ChildBots", new int[] {156,21,168,17},
																new Predicate("goingTo", new Term[] {
																	new Variable(Type.STRING, "room")
																})
															),
															new Send("bw4t.ChildBots", new int[] {157,21,157,67},
																new Performative("inform"),
																new ModuleTerm("system", Type.STRING,
																	new Predicate("getOwner", new Term[] {}),
																	new ModuleTermAdaptor() {
																		public Object invoke(Intention intention, Predicate predicate) {
																			return ((astra.lang.System) intention.getModule("bw4t.ChildBots","system")).getOwner(
																			);
																		}
																		public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																			return ((astra.lang.System) visitor.agent().getModule("bw4t.ChildBots","system")).getOwner(
																			);
																		}
																	}
																),
																new Predicate("goingTo", new Term[] {
																	new Variable(Type.STRING, "room")
																})
															),
															new Query(
																"bw4t.ChildBots", new int[] {160,21,160,51},
																new Predicate("agents", new Term[] {
																	new Variable(Type.LIST, "agentsList",false)
																})
															),
															new ForAll(
																"bw4t.ChildBots", new int[] {161,21,161,58},
																new Variable(Type.STRING, "agentInst",false),
																new Variable(Type.LIST, "agentsList"),
																new Block(
																	"bw4t.ChildBots", new int[] {161,58,168,17},
																	new Statement[] {
																		new If(
																			"bw4t.ChildBots", new int[] {162,25,165,22},
																			new NOT(
																				new BracketFormula(
																					new Comparison("==",
																						new ModuleTerm("system", Type.STRING,
																							new Predicate("name", new Term[] {}),
																							new ModuleTermAdaptor() {
																								public Object invoke(Intention intention, Predicate predicate) {
																									return ((astra.lang.System) intention.getModule("bw4t.ChildBots","system")).name(
																									);
																								}
																								public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																									return ((astra.lang.System) visitor.agent().getModule("bw4t.ChildBots","system")).name(
																									);
																								}
																							}
																						),
																						new Variable(Type.STRING, "agentInst")
																					)
																				)
																			),
																			new Block(
																				"bw4t.ChildBots", new int[] {162,56,164,26},
																				new Statement[] {
																					new Send("bw4t.ChildBots", new int[] {163,29,163,67},
																						new Performative("inform"),
																						new Variable(Type.STRING, "agentInst"),
																						new Predicate("goingTo", new Term[] {
																							new Variable(Type.STRING, "room")
																						})
																					)
																				}
																			)
																		)
																	}
																)
															),
															new Subgoal(
																"bw4t.ChildBots", new int[] {167,21,168,17},
																new Goal(
																	new Predicate("findColorsInRooms", new Term[] {
																		new Variable(Type.STRING, "room"),
																		new Variable(Type.LIST, "colorsSequence")
																	})
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
					),
					new If(
						"bw4t.ChildBots", new int[] {172,8,177,6},
						new Comparison("==",
							new ModuleTerm("system", Type.STRING,
								new Predicate("name", new Term[] {}),
								new ModuleTermAdaptor() {
									public Object invoke(Intention intention, Predicate predicate) {
										return ((astra.lang.System) intention.getModule("bw4t.ChildBots","system")).name(
										);
									}
									public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
										return ((astra.lang.System) visitor.agent().getModule("bw4t.ChildBots","system")).name(
										);
									}
								}
							),
							Primitive.newPrimitive("Bot_2")
						),
						new Block(
							"bw4t.ChildBots", new int[] {172,34,174,9},
							new Statement[] {
								new ModuleCall("environment",
									"bw4t.ChildBots", new int[] {173,12,173,41},
									new Predicate("goTo", new Term[] {
										Primitive.newPrimitive("LeftHallD")
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return true;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.EIS) intention.getModule("bw4t.ChildBots","environment")).auto_action(intention,evaluate(intention,predicate));
										}
									}
								)
							}
						),
						new Block(
							"bw4t.ChildBots", new int[] {174,13,177,6},
							new Statement[] {
								new ModuleCall("environment",
									"bw4t.ChildBots", new int[] {175,12,175,42},
									new Predicate("goTo", new Term[] {
										Primitive.newPrimitive("RightHallD")
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return true;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.EIS) intention.getModule("bw4t.ChildBots","environment")).auto_action(intention,evaluate(intention,predicate));
										}
									}
								)
							}
						)
					)
				}
			)
		));
	}

	public void initialize(astra.core.Agent agent) {
		agent.addSensorAdaptor(new SensorAdaptor() {
			public void sense(astra.core.Agent agent) {
				((astra.lang.EIS) agent.getModule("bw4t.ChildBots","environment")).sense();
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
			astra.core.Agent agent = new ChildBots().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}

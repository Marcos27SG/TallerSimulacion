
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MARCOS
 */
public class Demanda {

    public double calcular(int a) {

        int b = a % 12;
        //factor estacional
        double[] estacion = {0.90, 0.80, 1.08, 1.04, 0.70, 1, 0.56, 0.68, 0.95, 0.85, 1, 1.10};
        double res;
        Random rand = new Random();
        float r = rand.nextFloat();
        //numero aleatorio
        if (r >= 0 && r < 0.01) {
            res = (int)(estacion[b] * 35);
        } else {
            if (r < 0.025) {
                res = estacion[b] * 36;
            } else {
                if (r < 0.045) {
                    res = estacion[b] * 37;
                } else {
                    if (r < 0.065) {
                        res = estacion[b] * 38;
                    } else {
                        if (r < 0.087) {
                            res = estacion[b] * 39;
                        } else {
                            if (r < 0.11) {
                                res = estacion[b] * 40;
                            } else {
                                if (r < 0.135) {
                                    res = estacion[b] * 41;
                                } else {
                                    if (r < 0.162) {
                                        res = estacion[b] * 42;
                                    } else {
                                        if (r < 0.19) {
                                            res = estacion[b] * 43;
                                        } else {
                                            if (r < 0.219) {
                                                res = estacion[b] * 44;
                                            } else {
                                                if (r < 0.254) {
                                                    res = estacion[b] * 45;
                                                } else {
                                                    if (r < 0.299) {
                                                        res = estacion[b] * 46;
                                                    } else {
                                                        if (r < 0.359) {
                                                            res = estacion[b] * 47;
                                                        } else {
                                                            if (r < 0.424) {
                                                                res = estacion[b] * 48;
                                                            } else {
                                                                if (r < 0.494) {
                                                                    res = estacion[b] * 49;
                                                                } else {
                                                                    if (r < 0.574) {
                                                                        res = estacion[b] * 50;
                                                                    } else {
                                                                        if (r < 0.649) {
                                                                            res = estacion[b] * 51;
                                                                        } else {
                                                                            if (r < 0.719) {
                                                                                res = estacion[b] * 52;
                                                                            } else {
                                                                                if (r < 0.784) {
                                                                                    res = estacion[b] * 53;
                                                                                } else {
                                                                                    if (r < 0.844) {
                                                                                        res = estacion[b] * 54;
                                                                                    } else {
                                                                                        if (r < 0.894) {
                                                                                            res = estacion[b] * 55;
                                                                                        } else {
                                                                                            if (r < 0.934) {
                                                                                                res = estacion[b] * 56;
                                                                                            } else {
                                                                                                if (r < 0.964) {
                                                                                                    res = estacion[b] * 57;
                                                                                                } else {
                                                                                                    if (r < 0.980) {
                                                                                                        res = estacion[b] * 58;
                                                                                                    } else {
                                                                                                        if (r < 0.995) {
                                                                                                            res = estacion[b] * 59;
                                                                                                        } else {

                                                                                                            res = estacion[b] * 60;

                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return (int)res;

    }
}

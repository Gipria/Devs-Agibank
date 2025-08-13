# Teste de mesa

---
## Desvio padrao(calcularVolatilidade)

> valores = {0.01, 0.02, -0.01, 0.03, -0.02}

> `n = 5`


### Passo 1: calcular a soma dos valores
```java
double soma = 0;
for(double valor : valores){
    soma += valor;
}
```


| Iteração | valor | soma antes | soma depois           |
| -------- | ----- | ---------- | --------------------- |
| 1        | 0.01  | 0          | 0 + 0.01 = 0.01       |
| 2        | 0.02  | 0.01       | 0.01 + 0.02 = 0.03    |
| 3        | -0.01 | 0.03       | 0.03 + (-0.01) = 0.02 |
| 4        | 0.03  | 0.02       | 0.02 + 0.03 = 0.05    |
| 5        | -0.02 | 0.05       | 0.05 + (-0.02) = 0.03 |

### Resultado:
> soma = 0.03

### Passo 2: calcular a média
````java
double media = soma / n; // 0.03 / 5 = 0.006
````
### Resultado:
> media = 0.006

---

### Passo 3: calcular soma dos quadrados das diferenças

```java
double somaQuadrado = 0;
for(double valor : valores){
    double diff = valor - media;
    somaQuadrado += diff * diff;
}
```

| Iteração | valor | diff = valor - media   | diff² = diff \* diff | somaQuadrado antes | somaQuadrado depois            |
| -------- | ----- | ---------------------- | -------------------- | ------------------ | ------------------------------ |
| 1        | 0.01  | 0.01 - 0.006 = 0.004   | 0.000016             | 0                  | 0 + 0.000016 = 0.000016        |
| 2        | 0.02  | 0.02 - 0.006 = 0.014   | 0.000196             | 0.000016           | 0.000016 + 0.000196 = 0.000212 |
| 3        | -0.01 | -0.01 - 0.006 = -0.016 | 0.000256             | 0.000212           | 0.000212 + 0.000256 = 0.000468 |
| 4        | 0.03  | 0.03 - 0.006 = 0.024   | 0.000576             | 0.000468           | 0.000468 + 0.000576 = 0.001044 |
| 5        | -0.02 | -0.02 - 0.006 = -0.026 | 0.000676             | 0.001044           | 0.001044 + 0.000676 = 0.00172  |

### Resultado: 
> somaQuadrado = 0.00172

---

### Passo 4: calcular a variância
```java
double variancia = somaQuadrado / n; // 0.00172 / 5 = 0.000344
```
### Resultado: 
> variancia = 0.000344

---

### Passo 5: calcular o desvio padrão
```java
double desvioPadrao = Math.sqrt(variancia); // sqrt(0.000344) ≈ 0.01855
```
### Resultado:
> desvioPadrao ≈ 0.01855
valores = {
"Estudiante 1": {'notas': [10,10,3], 'carrera': 'Sistemas', 'edad': 20},
"Estudiante 2": {'notas': [10,9,3], 'carrera': 'Electronica', 'edad': 19},
"Estudiante 3": {'notas': [9,10,3], 'carrera': 'Contabilidad', 'edad': 18},
"Estudiante 4": {'notas': [8,9,4], 'carrera': 'Sistemas', 'edad': 20},
"Estudiante 5": {'notas': [8,8,5], 'carrera': 'Electronica', 'edad': 19},
"Estudiante 6": {'notas': [3,10,6], 'carrera': 'Contabilidad', 'edad': 18},
"Estudiante 7": {'notas': [2,8,7], 'carrera': 'Sistemas', 'edad': 20},
"Estudiante 8": {'notas': [1,9,3], 'carrera': 'Economia', 'edad': 20},
"Estudiante 9": {'notas': [9,10,2], 'carrera': 'Sistemas', 'edad': 19},
}

Contabilidad=0
Electronica=0
Sistemas=0
Economia=0
suma=0
sumaEdades=0
print("\nREPORTE DE ESTUDIANTES\n\n")

for i in range(1,10):
  notas=valores.get("Estudiante "+str(i)).get("notas")
  sumaEdades+=valores.get("Estudiante "+str(i)).get("edad")
  if valores.get("Estudiante "+str(i)).get("carrera")=="Sistemas":
    Sistemas+=1
  if valores.get("Estudiante "+str(i)).get("carrera")=="Electronica":
    Electronica+=1
  if valores.get("Estudiante "+str(i)).get("carrera")=="Contabilidad":
    Contabilidad+=1
  if valores.get("Estudiante "+str(i)).get("carrera")=="Economia":
    Economia+=1
  
  for j in notas:
    suma+=j
    promedio=suma/3
  print("Estudiante %s tiene de promedio: %.2f"%(i,promedio))
  suma=0
  pass
print()
print(Sistemas," Estudiantes de Sistemas")
print(Electronica," Estudiantes de Electronica")
print(Contabilidad," Estudiantes de Contabilidad")
print(Economia," Estudiantes de Economia")
print()
print("El promedio de edades de los estudiantes es: %.2f"%(sumaEdades/9))


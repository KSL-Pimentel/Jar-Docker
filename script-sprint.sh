#!/bin/bash

sudo apt-get update && sudo apt-get upgrade #atualiza o ambiente

-Y

java -version

if [ $? = 0 ]; #se retorno for igual a 0
	then #entao,
		echo "java instalado" #print no terminal

		cd Easy---JAR
		if [ $? = 0 ]
		then
			git fetch && git pull
			cd project-easy/target
		else
			git clone https://github.com/KSL-Pimentel/jar-individual-bp.git
			cd jar-individual-bp/project-easy/target
		fi

		java -jar project-easy-1.0-SNAPSHOT-jar-with-dependencies.jar

	else #se nao,
		echo "java não instalado" #print no terminal
		echo "gostaria de instalar o java? [s/n]" #print no terminal

		read get #variavel que guarda resposta do usuário

	if [ \"$get\" == \"s\" ]; #se retorno for igual a 0

	then #entao
	sudo apt install openjdk-17-jre -y #executa instalacao do java

	cd Easy---JAR
		if [ $? = 0 ]
		then
			git fetch && git pull
			cd Easy---JAR/project-easy/target
		else
			git clone https://github.com/KSL-Pimentel/jar-individual-bp.git
			cd jar-individual-bp/project-easy/target
		fi

		java -jar project-easy-1.0-SNAPSHOT-jar-with-dependencies.jar

	fi #fecha o 2o if

fi #fecha o 1o if



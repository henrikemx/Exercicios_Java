# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

#!/usr/bin/python3
# -*- coding: UTF-8 -*-

from random import randint
a1 = str(input('Informe o nome do 1º aluno: '))
a2 = str(input('Informe o nome do 2º aluno: '))
a3 = str(input('Informe o nome do 3º aluno: '))
a4 = str(input('Informe o nome do 4º aluno: '))

sorteio = randint(1, 4)

if (sorteio == 1) :
    print('O aluno escolhido é: {}'.format(a1))
if (sorteio == 2) :
    print('O aluno escolhido é: {}'.format(a2))
if (sorteio == 3) :
    print('O aluno escolhido é: {}'.format(a3))
if (sorteio == 4) :
    print('O aluno escolhido é: {}'.format(a4))

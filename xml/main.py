import xml.etree.ElementTree as ET

def main():
	tree = ET.parse('exemplo.xml')
	root = tree.getroot()

	print( 'vetex list bellow\n' )

	for v in root.findall('vertex'):
		#imprimindo o nome do vertice
		name = v.get('name')
		
		px = v.find('px').text
		py = v.find('py').text

		print( 'nome = %s x= %s y=%s' % (name, px, py) )


	print( '\n\nedge list bellow\n' )

	for v in root.findall('edge'):
		f = v.find('from').text
		to = v.find('to').text

		print( '%s -> %s' % (f, to) )

if __name__ == '__main__':
    main()
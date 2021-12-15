package task._06_task.task3;


import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class DAO {
    private File file;

    {
        file = new File("src" + File.separator + "task" + File.separator + "_06_tasks" + File.separator + "task3" + File.separator + "archive.xml");
    }

    public void save(Student student) {
        if (file.exists()) {
            addStudent(student);

        } else {
            createXmlAndSaveStudent(student);
        }

    }

    public Student get(String mail) {
        Student student;
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(file);
            doc.getDocumentElement().normalize();

            NodeList studList = doc.getElementsByTagName("student");

            for (int i = 0; i < studList.getLength(); i++) {
                Node studNode = studList.item(i);
                if (studNode.getNodeType() != Node.ELEMENT_NODE) {
                    continue;
                }
                Element eElement = (Element) studNode;
                String mailStr = eElement.getElementsByTagName("mail")
                        .item(0)
                        .getTextContent();
                if (!mailStr.equals(mail)) {
                    continue;
                }
                String nameStr = eElement.getElementsByTagName("name").item(0).getTextContent();
                String surnameStr = eElement.getElementsByTagName("surname").item(0).getTextContent();
                String textStr = eElement.getElementsByTagName("text").item(0).getTextContent();

                student = new Student(nameStr, surnameStr, mailStr, textStr);

                return student;
            }
        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void update(Student student) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(file);
            NodeList studList = doc.getElementsByTagName("student");

            for (int i = 0; i < studList.getLength(); i++) {
                Node studNode = studList.item(i);

                if (studNode.getNodeType() != Node.ELEMENT_NODE) {
                    continue;
                }

                Element eElement = (Element) studNode;
                String mailStr = eElement.getElementsByTagName("mail").item(0).getTextContent();

                if (student.getMail().equals(mailStr)) {
                    Node nameNode = eElement.getElementsByTagName("name").item(0);
                    Node surnameNode = eElement.getElementsByTagName("surname").item(0);
                    Node textNode = eElement.getElementsByTagName("text").item(0);

                    nameNode.setTextContent(student.getName());
                    surnameNode.setTextContent(student.getSurname());
                    textNode.setTextContent(student.getText());
                    break;
                }
            }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult consoleResult = new StreamResult(file);
            transformer.transform(source, consoleResult);

        } catch (IOException | ParserConfigurationException | TransformerException | SAXException e) {
            e.printStackTrace();
        }

    }

    public void remove(Student student) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(file);
            NodeList studList = doc.getElementsByTagName("student");

            for (int i = 0; i < studList.getLength(); i++) {
                Node studNode = studList.item(i);

                if (studNode.getNodeType() != Node.ELEMENT_NODE) {
                    continue;
                }

                Element eElement = (Element) studNode;
                String mailStr = eElement.getElementsByTagName("mail").item(0).getTextContent();
                if (student.getMail().equals(mailStr)) {
                    Node groupNode = doc.getFirstChild();
                    groupNode.removeChild(studNode);
                }
            }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult consoleResult = new StreamResult(file);
            transformer.transform(source, consoleResult);


        } catch (ParserConfigurationException | IOException | SAXException | TransformerException e) {
            e.printStackTrace();
        }
    }

    private void addStudent(Student student) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(file);

            Node firstNode = doc.getFirstChild();
            Element groupElement = (Element) firstNode;

            Element studentElement = doc.createElement("student");
            groupElement.appendChild(studentElement);

            Element nameElement = doc.createElement("name");
            nameElement.appendChild(doc.createTextNode(student.getName()));
            studentElement.appendChild(nameElement);

            Element surnameElement = doc.createElement("surname");
            surnameElement.appendChild(doc.createTextNode(student.getSurname()));
            studentElement.appendChild(surnameElement);

            Element mailElement = doc.createElement("mail");
            mailElement.appendChild(doc.createTextNode(student.getMail()));
            studentElement.appendChild(mailElement);

            Element textElement = doc.createElement("text");
            textElement.appendChild(doc.createTextNode(student.getText()));
            studentElement.appendChild(textElement);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult consoleResult = new StreamResult(file);
            transformer.transform(source, consoleResult);

        } catch (ParserConfigurationException | IOException | SAXException | TransformerException e) {
            e.printStackTrace();
        }
    }


    private void createXmlAndSaveStudent(Student student) {
        DocumentBuilderFactory dbFactory;
        DocumentBuilder dBuilder;
        Document doc;
        try {
            dbFactory = DocumentBuilderFactory.newInstance();
            dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.newDocument();

            Element groupElement = doc.createElement("group");
            doc.appendChild(groupElement);

            Element studentElement = doc.createElement("student");
            groupElement.appendChild(studentElement);

            Element nameElement = doc.createElement("name");
            nameElement.appendChild(doc.createTextNode(student.getName()));
            studentElement.appendChild(nameElement);

            Element surnameElement = doc.createElement("surname");
            surnameElement.appendChild(doc.createTextNode(student.getSurname()));
            studentElement.appendChild(surnameElement);


            Element mailElement = doc.createElement("mail");
            mailElement.appendChild(doc.createTextNode(student.getMail()));
            studentElement.appendChild(mailElement);

            Element textElement = doc.createElement("text");
            textElement.appendChild(doc.createTextNode(student.getText()));
            studentElement.appendChild(textElement);


            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(file);
            transformer.transform(source, result);

        } catch (TransformerConfigurationException transformerConfigurationException) {
            transformerConfigurationException.printStackTrace();
        } catch (ParserConfigurationException parserConfigurationException) {
            parserConfigurationException.printStackTrace();
        } catch (TransformerException transformerException) {
            transformerException.printStackTrace();
        }
    }
}

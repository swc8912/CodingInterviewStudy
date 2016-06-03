#pragma once
#include <cstdlib>

class Deque
{
private:
	typedef struct Node
	{
		int data;
		Node* prev;
		Node* next;
	} Node;

	Node* head;
	Node* tail;

public:
	Deque()
	{
		head = NULL;
		tail = NULL;
	}

	Node* createNode(int data)
	{
		Node* newNode = (Node*)malloc(sizeof(Node));
		newNode->data = data;
		if (head == NULL)
			head = newNode;
		if (tail == NULL)
			tail = head;

		head->prev = NULL;
		tail->next = NULL;
		return newNode;
	}

	void addFront(Node* node)
	{
		if (head != NULL)
		{
			head->prev = node;
			node->next = head;
			head = node;
		}
	}

	void addBack(Node* node)
	{
		if (tail != NULL)
		{
			tail->next = node;
			node->prev = tail;
			tail = node;
		}
	}

	void removeFront()
	{
		if (head != NULL)
		{
			Node* temp = head;
			head = head->next;
			if (head == tail)
				tail = NULL;
			free(temp);
		}
	}

	Node* getFront()
	{
		if (head != NULL)
		{
			return head;
		}

		return NULL;
	}

	void removeBack()
	{
		if (tail != NULL)
		{
			Node* temp = tail;
			tail = tail->prev;
			if(head == tail)
				head = NULL;
			free(temp);
		}
	}

	Node* getBack()
	{
		if (tail != NULL)
		{
			return tail;
		}

		return NULL;
	}

	bool isEmpty()
	{
		return head == NULL && tail == NULL ? true : false;
	}
};

